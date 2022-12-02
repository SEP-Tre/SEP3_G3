using System.Text.Json;
using Application.LogicInterfaces;
using AspNetCoreDateAndTimeOnly.Json;
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
    public async Task<ActionResult<FoodPost>> CreateAsync(FoodPostCreationDto dto)
    {
        try
        {
            FoodPost foodPost = await fpLogic.CreateAsync(dto);

            return Created($"/FoodPosts/{foodPost.PostId}", foodPost);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);

            return StatusCode(500, e.Message);
        }
    }

    [HttpGet]
    public async Task<ActionResult<IEnumerable<FoodPost>>> GetAsync()
    {
        try
        {
            var posts = await fpLogic.GetAsync();

            return Ok(posts);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);

            return StatusCode(500, e.Message);
        }
    }

    [HttpGet, Route("Single")]
    public async Task<ActionResult<FoodPost>> GetSingleAsync([FromQuery] int id)
    {
        try
        {
            FoodPost foodPost = await fpLogic.GetSingleAsync(id);

            return Ok(foodPost);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);

            return StatusCode(500, e.Message);
        }
    }

    // TODO: Preemptively solve conflict
    // Could conflict with a later need to update the post
    [HttpPatch]
    public async Task<ActionResult> ReserveAsync([FromBody] FoodPostReservationDto dto)
    {
        try
        {
            await fpLogic.ReserveAsync(dto);

            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);

            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet, Route( "ByUser")]
    public async Task<ActionResult<IEnumerable<FoodPost>>> GetFoodPostsByUsername([FromQuery] String username)
    {
        try
        {
            IEnumerable<FoodPost> foodPosts = await fpLogic.GetAllFoodPostsByUser(username);
            return Ok(foodPosts);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }
}