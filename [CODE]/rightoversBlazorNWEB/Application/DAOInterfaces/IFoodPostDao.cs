﻿using Domain.Classes;
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
    Task<IEnumerable<FoodPost>> GetAllReportedPostsAsync();

    Task<Report> ReportAsync(Report report);
    Task<IEnumerable<Report>> GetReportsOnPostAsync(int postId);
    Task<FoodPost> EditAsync(FoodPost foodPost);

    Task ResolveReportAsync(int id);
}