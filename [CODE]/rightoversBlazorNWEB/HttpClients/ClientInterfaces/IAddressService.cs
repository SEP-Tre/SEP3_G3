using Domain.DTOs;

namespace HttpClients.ClientInterfaces;

public interface IAddressService
{
    Task<AddressDTO> CreateAsync(AddressDTO dto);
    Task<ICollection<AddressDTO>> GetAsync();
    Task<AddressDTO> GetCoordsAsync(AddressDTO addressDto);
}