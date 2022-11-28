using Domain.DTOs;

namespace Application.DAOInterfaces;

public interface IAddressDao
{
    public Task<AddressCreationDto> Create(AddressCreationDto dto);
    public Task<IEnumerable<AddressCreationDto>> GetAll();
}