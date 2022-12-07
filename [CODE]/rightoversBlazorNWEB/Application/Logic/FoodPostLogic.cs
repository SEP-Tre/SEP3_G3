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
        Console.WriteLine("Received in application: " + dto);

        if (string.IsNullOrEmpty(dto.Title))
        {
            throw new Exception("Title should not be empty.");
        }

        if (string.IsNullOrEmpty(dto.Category))
        {
            throw new Exception("Category should not be empty.");
        }

        if (string.IsNullOrEmpty(dto.Description))
        {
            throw new Exception("Description should not be empty.");
        }

        if (string.IsNullOrEmpty(dto.PictureUrl))
        {
            throw new Exception("Picture Url should not be empty.");
        }

        if (dto.DaysUntilExpired == 0)
        {
            throw new Exception("Days Until Expiration should not be empty.");
        }

        string url = dto.PictureUrl;

        if (!Uri.IsWellFormedUriString(url, UriKind.Absolute))
        {
            throw new Exception("The url is not valid.");
        }

        return fpDao.Create(dto);
    }

    public async Task<IEnumerable<FoodPost>> GetAsync()
    {
        var allPosts = await fpDao.GetAsync();
        Console.WriteLine(allPosts.ToString());

        return allPosts;
    }

    public Task<FoodPost> GetSingleAsync(int id)
    {
        return fpDao.GetSingleAsync(id);
    }

    public Task<IEnumerable<FoodPost>> GetAllFoodPostsByUser(string username)
    {
        return fpDao.GetAllFoodPostsByUser(username);
    }

    public async Task<FoodPost> PickUp(PickUpDto dto)
    {
        return await fpDao.PickUp(dto);
    }

    public async Task DeleteAsync(int id)
    {
        await fpDao.DeleteAsync(id);
    }

    public async Task<Report> ReportAsync(Report report)
    {
        return await fpDao.ReportAsync(report);
    }

    public async Task ReserveAsync(FoodPostReservationDto dto)
    {
        await fpDao.Reserve(dto);
    }

    public async Task<IEnumerable<FoodPost>> GetAllReportedPostsAsync()
    {
        return await fpDao.GetAllReportedPostsAsync();
    }

    public async Task<IEnumerable<Report>> GetReportsOnPostAsync(int postId)
    {
        return await fpDao.GetReportsOnPostAsync(postId);
    }
}