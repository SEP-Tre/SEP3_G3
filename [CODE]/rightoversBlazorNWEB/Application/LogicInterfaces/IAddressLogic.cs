using Domain.Classes;
using Domain.DTOs;

namespace Application.LogicInterfaces;

public interface IAddressLogic
{
    Task<AddressCreationDTO> CreateAsync(AddressCreationDTO addressDto);
    Task<IEnumerable<AddressCreationDTO>> GetAllAsync();
}