using Domain.Classes;
using Domain.DTOs;

namespace HttpClients.ClientInterfaces;

public interface IFoodPostService
{
    Task<FoodPost> Create(FoodPostCreationDTO dto);
}