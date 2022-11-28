using Domain.DTOs;

namespace HttpClients.ClientInterfaces;

public interface IAddressService
{
    Task<AddressCreationDTO> CreateAsync(AddressCreationDTO dto);
    Task<ICollection<AddressCreationDTO>> GetAsync();
    Task<AddressCreationDTO> GetCoordsAsync(AddressCreationDTO addressDto);
}