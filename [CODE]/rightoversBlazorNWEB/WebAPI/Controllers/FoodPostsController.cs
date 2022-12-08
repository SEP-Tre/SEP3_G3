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
    public async Task<ActionResult<FoodPost>> CreateAsync(FoodPostCreationDto dto)
    {
        try
        {
            var foodPost = await fpLogic.CreateAsync(dto);

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

    [HttpGet]
    [Route("Single")]
    public async Task<ActionResult<FoodPost>> GetSingleAsync([FromQuery] int id)
    {
        try
        {
            var foodPost = await fpLogic.GetSingleAsync(id);

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

    [HttpGet]
    [Route("ByUser")]
    public async Task<ActionResult<IEnumerable<FoodPost>>> GetFoodPostsByUsername([FromQuery] string username)
    {
        try
        {
            var foodPosts = await fpLogic.GetAllFoodPostsByUser(username);

            return Ok(foodPosts);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

    [HttpPost]
    [Route("Pick")]
    public async Task<ActionResult<FoodPost>> PickUpAsync(PickUpDto dto)
    {
        try
        {
            FoodPost fp = await fpLogic.PickUp(dto);
            return Ok(fp);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

    [HttpDelete]
    public async Task<ActionResult> DeleteAsync([FromQuery] int id)
    {
        try
        {
            await fpLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

    [HttpGet]
    [Route("Reported")]
    public async Task<ActionResult<IEnumerable<FoodPost>>> GetAllReportedPostsAsync()
    {
        try
        {
           var reportedPosts = await fpLogic.GetAllReportedPostsAsync();

           return Ok(reportedPosts);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }
    
    [HttpGet]
    [Route("Reports/{id:int}")]
    public async Task<ActionResult<IEnumerable<FoodPost>>> GetReportsOnPost([FromRoute]int id)
    {
        try
        {
            var reports = await fpLogic.GetReportsOnPostAsync(id);

            return Ok(reports);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

    [HttpPost]
    [Route("Report")]
    public async Task<ActionResult<Report>> ReportAsync(Report report)
    {
        try
        {
            Console.WriteLine(report.Comment);
            Report savedReport =await fpLogic.ReportAsync(report);  
            return Ok( savedReport);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
            return BadRequest(e.Message);
        }
    }

    [HttpPatch]
    [Route("Edit")]
    public async Task<ActionResult<FoodPost>> EditAsync([FromBody] FoodPost foodPost)
    {
        try
        {
            return await fpLogic.EditAsync(foodPost);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);

            throw;
        }
    }

    [HttpDelete]
    [Route("Report")]
    public async Task<ActionResult> ResolveReportAsync([FromQuery] int id)
    {
        try
        {
            await fpLogic.ResolveReportAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

}