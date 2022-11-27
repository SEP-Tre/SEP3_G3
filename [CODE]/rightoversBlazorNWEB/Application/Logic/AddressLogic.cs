using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Domain.Classes;
using Domain.DTOs;

namespace Application.Logic;

public class AddressLogic : IAddressLogic
{
    private readonly IAddressDao addressDao;

    public AddressLogic(IAddressDao dao)
    {
        addressDao = dao;
    }

    public async Task<AddressCreationDTO> CreateAsync(AddressCreationDTO addressDto)
    {
        return await addressDao.Create(addressDto);
    }

    public async Task<IEnumerable<AddressCreationDTO>> GetAllAsync()
    {
        return await addressDao.GetAll();
    }
}