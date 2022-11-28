using Domain.DTOs;

namespace HttpClients.ClientInterfaces;

public interface IAddressService
{
    Task<AddressCreationDto> CreateAsync(AddressCreationDto dto);
    Task<ICollection<AddressCreationDto>> GetAsync();
    Task<AddressCreationDto> GetCoordsAsync(AddressCreationDto addressDto);
}