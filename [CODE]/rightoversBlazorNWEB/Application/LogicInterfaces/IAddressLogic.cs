using Domain.Classes;
using Domain.DTOs;

namespace Application.LogicInterfaces;

public interface IAddressLogic
{
    Task<AddressCreationDto> CreateAsync(AddressCreationDto addressDto);
    Task<IEnumerable<AddressCreationDto>> GetAllAsync();
}