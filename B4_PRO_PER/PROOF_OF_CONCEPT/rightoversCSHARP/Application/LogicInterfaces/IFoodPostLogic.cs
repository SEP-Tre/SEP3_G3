using Domain.Classes;
using Domain.DTOs;

namespace Application.LogicInterfaces;

public interface IFoodPostLogic
{
    public Task<FoodPost> CreateAsync(FoodPostCreationDTO dto);
}