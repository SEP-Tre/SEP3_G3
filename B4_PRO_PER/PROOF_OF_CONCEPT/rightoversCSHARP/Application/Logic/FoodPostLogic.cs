using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Domain.Classes;
using Domain.DTOs;

namespace Application.Logic;

public class FoodPostLogic : IFoodPostLogic
{
    private readonly IFoodPostDao fpDao;

    public FoodPostLogic(IFoodPostDao dao)
    {
        fpDao = dao;
    }
    
    public Task<FoodPost> CreateAsync(FoodPostCreationDTO dto)
    {
        return fpDao.Create(dto);
    }
}