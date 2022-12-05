using Application.LogicInterfaces;
using Domain.Classes;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class RatingsController : ControllerBase
{
    private readonly IRatingLogic ratingLogic;

    public RatingsController(IRatingLogic ratingLogic)
    {
        this.ratingLogic = ratingLogic;
    }

    [HttpPost]
    public async Task<ActionResult<Rating>> AddRatingAsync(Rating rating)
    {
        try
        {
            Rating savedRating = await ratingLogic.AddRating(rating);
            return Ok(savedRating);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

    [HttpGet]
    [Route("/BeingRated/{username}")]
    public async Task<ActionResult<List<Rating>>> GetAllByUserRated([FromRoute] string username)
    {
        try
        {
            List<Rating> ratings = await ratingLogic.GetAllByUserRated(username);
            return Ok(ratings);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }
    [HttpGet]
    [Route("/MakingRating/{username}")]
    public async Task<ActionResult<List<Rating>>> GetAllByUserRating([FromRoute] string username)
    {
        try
        {
            List<Rating> ratings = await ratingLogic.GetAllByUserRating(username);
            return Ok(ratings);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }
}