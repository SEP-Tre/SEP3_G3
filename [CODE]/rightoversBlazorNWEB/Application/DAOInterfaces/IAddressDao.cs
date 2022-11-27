using Domain.DTOs;

namespace Application.DAOInterfaces;

public interface IAddressDao
{
    public Task<AddressCreationDTO> Create(AddressCreationDTO dto);
    public Task<IEnumerable<AddressCreationDTO>> GetAll();
}