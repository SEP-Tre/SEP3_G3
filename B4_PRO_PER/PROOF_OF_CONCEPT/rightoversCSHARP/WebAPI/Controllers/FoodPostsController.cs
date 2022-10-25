using Application.LogicInterfaces;
using Domain.Classes;
using Domain.DTOs;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class FoodPostsController : ControllerBase
{
    private readonly IFoodPostLogic fpLogic;

    public FoodPostsController(IFoodPostLogic fpLogic)
    {
        this.fpLogic = fpLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<FoodPost>> CreateAsync(FoodPostCreationDTO dto)
    {
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
        
        
        try
        {
            FoodPost foodPost = await fpLogic.CreateAsync(dto);
            return Created($"/foodposts/{foodPost.PostId}", foodPost);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    


}