using Domain.Classes;
using Domain.DTOs;

namespace Application.LogicInterfaces;

public interface IFoodPostLogic
{
    public Task<FoodPost> CreateAsync(FoodPostCreationDto dto);
    Task<IEnumerable<FoodPost>> GetAsync();
    public Task<FoodPost> GetSingleAsync(int id);
    public Task ReserveAsync(FoodPostReservationDto dto);
    Task<IEnumerable<FoodPost>> GetAllFoodPostsByUser(string username);
}