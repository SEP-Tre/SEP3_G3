using AddressGrpcCl;
using Application.DAOInterfaces;
using Domain.DTOs;
using Grpc.Core;
using Grpc.Net.Client;

namespace GrpcClient.DAOs;

public class AddressDao : IAddressDao

{
    private readonly static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:9090", new GrpcChannelOptions{
        UnsafeUseInsecureChannelCallCredentials = true
    });

    private readonly static AddressService.AddressServiceClient client =
        new AddressService.AddressServiceClient(channel);

    public Task<AddressCreationDto> Create(AddressCreationDto dto)
    {
        // Await here would be nice
        var response = client.createAddress(new AddressRequest{
            Street = dto.Street,
            StreetNumber = dto.StreetNumber,
            PostCode = dto.PostCode,
            City = dto.City,
            Longitude = dto.Longitude,
            Latitude = dto.Latitude
        });
        Console.WriteLine(dto);
        Console.WriteLine(response);

        var addressDto = new AddressCreationDto(
            response.AddressId,
            response.StreetNumber,
            response.Street,
            response.PostCode,
            response.City,
            response.Longitude,
            response.Latitude);

        return Task.FromResult(addressDto);
    }

    public async Task<IEnumerable<AddressCreationDto>> GetAll()
    {
        var listHolder = new List<AddressCreationDto>();
        AsyncServerStreamingCall<AddressResponse> response = client.getAllAddresses(
            new GetAllRequest{
                Filler = true
            });
        await foreach (var message in response.ResponseStream.ReadAllAsync())
            if (message.StreetNumber != null)
            {
                var addressDto = new AddressCreationDto{
                    AddressId = message.AddressId,
                    Street = message.Street,
                    StreetNumber = message.StreetNumber,
                    PostCode = message.PostCode,
                    City = message.City,
                    Longitude = message.Longitude,
                    Latitude = message.Latitude
                };
                listHolder.Add(addressDto);
            }

        return listHolder;
    }
}