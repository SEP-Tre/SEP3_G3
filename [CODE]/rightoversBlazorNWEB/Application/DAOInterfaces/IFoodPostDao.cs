using Domain.Classes;
using Domain.DTOs;

namespace Application.DAOInterfaces;

public interface IFoodPostDao
{
    public Task<FoodPost> Create(FoodPostCreationDTO dto);
    public Task<IEnumerable<OverSimpleFoodPostDto>> GetAsync();
    public Task<FoodPost> GetSingleAsync(int id);
}