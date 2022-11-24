using AddressGrpcCl;
using Application.DAOInterfaces;
using Domain.Classes;
using Domain.DTOs;
using Grpc.Core;
using Grpc.Net.Client;
using GrpcCL;
using GetAllRequest = AddressGrpcCl.GetAllRequest;

namespace GrpcClient.DAOs;

public class AddressDao : IAddressDao

{
    private static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:9090", new GrpcChannelOptions{
        UnsafeUseInsecureChannelCallCredentials = true
    });

    private static AddressService.AddressServiceClient client = new(channel);

    public async Task<AddressDTO> Create(AddressDTO dto)
    {
        // Await here would be nice
        AddressResponse response = client.createAddress(new AddressRequest{
            Street = dto.Street,
            StreetNumber = dto.StreetNumber,
            PostCode = dto.PostCode,
            City = dto.City
        });
        Console.WriteLine(dto);
        Console.WriteLine(response);

        AddressDTO addressDto = new AddressDTO(
            response.AddressId,
            response.Street,
            response.StreetNumber,
            response.PostCode,
            response.City);

        return addressDto;
    }

    public async Task<IEnumerable<AddressDTO>> GetAll()
    {
        List<AddressDTO> listHolder = new List<AddressDTO>();
        AsyncServerStreamingCall<AddressResponse> response = client.getAllAddresses(
            new GetAllRequest{
                Filler = true
            });
        await foreach (var message in response.ResponseStream.ReadAllAsync())
        {
            if (message.StreetNumber != null)
            {
                AddressDTO addressDto = new AddressDTO{
                    AddressId = message.AddressId,
                    Street = message.Street,
                    StreetNumber = message.StreetNumber,
                    PostCode = message.PostCode,
                    City = message.City
                };
                listHolder.Add(addressDto);
            }
        }

        return listHolder;
    }
}