using Domain.Classes;
using Domain.DTOs;

namespace Application.DAOInterfaces;

public interface IFoodPostDao
{
    public Task<FoodPost> Create(FoodPostCreationDto dto);
    public Task<IEnumerable<FoodPost>> GetAsync();
    public Task<FoodPost> GetSingleAsync(int id);
    public Task Reserve(FoodPostReservationDto dto);
    Task<IEnumerable<FoodPost>> GetAllFoodPostsByUser(string username);

    Task<FoodPost> PickUp(PickUpDto dto);

    Task DeleteAsync(int id);
}