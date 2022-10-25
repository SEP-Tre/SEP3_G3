using Domain.Classes;
using Domain.DTOs;

namespace Application.DAOInterfaces;

public interface IFoodPostDao
{
    public Task<FoodPost> Create(FoodPostCreationDTO dto);
}