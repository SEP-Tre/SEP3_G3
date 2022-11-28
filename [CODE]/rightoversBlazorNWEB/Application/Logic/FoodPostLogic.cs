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

    public Task<FoodPost> CreateAsync(FoodPostCreationDto dto)
    {
        return fpDao.Create(dto);
    }

    public async Task<IEnumerable<OverSimpleFoodPostDto>> GetAsync()
    {
        IEnumerable<OverSimpleFoodPostDto> allPosts = await fpDao.GetAsync();
        Console.WriteLine(allPosts.ToString());

        return allPosts;
    }

    public Task<FoodPost> GetSingleAsync(int id)
    {
        return fpDao.GetSingleAsync(id);
    }

    public async Task ReserveAsync(FoodPostReservationDto dto)
    {
        await fpDao.Reserve(dto);
    }
}