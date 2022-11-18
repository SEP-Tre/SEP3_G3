using Domain.Classes;
using Domain.DTOs;

namespace Application.LogicInterfaces;

public interface IAddressLogic
{
    Task<AddressDTO> CreateAsync(AddressDTO addressDto);
    Task<IEnumerable<AddressDTO>> GetAllAsync();
}