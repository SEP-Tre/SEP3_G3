using Domain.DTOs;

namespace Application.DAOInterfaces;

public interface IAddressDao
{
    public Task<AddressDTO> Create(AddressDTO dto);
    public Task<IEnumerable<AddressDTO>> GetAll();
}