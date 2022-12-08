using Domain.Classes;
using Domain.DTOs;

namespace HttpClients.ClientInterfaces;

public interface IFoodPostService
{
    Task<FoodPost> Create(FoodPostCreationDto dto);
    Task<ICollection<FoodPost>> GetAsync();
    Task<FoodPost> GetSingleAsync(int id);
    Task ReserveAsync(FoodPostReservationDto dto);
    Task<IEnumerable<FoodPost>> GetAllFoodPostsByUser(string username);
    Task DeleteAsync(int id);

    Task<Report> ReportAsync(Report report);

}