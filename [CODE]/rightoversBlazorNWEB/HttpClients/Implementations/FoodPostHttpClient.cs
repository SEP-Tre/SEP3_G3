using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using Domain.Classes;
using Domain.DTOs;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class FoodPostHttpClient : IFoodPostService
{
    private readonly HttpClient client;

    public FoodPostHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<FoodPost> Create(FoodPostCreationDto dto)
    {
        /*
        var jso = new JsonSerializerOptions(JsonSerializerDefaults.Web);
        jso.Converters.Add(new DateOnlyJsonConverter());
        jso.Converters.Add(new TimeOnlyJsonConverter());
        */
        //TODO the problem is likely here.
        Console.WriteLine(dto);
        var response = await client.PostAsJsonAsync("/FoodPosts", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        var fp = JsonSerializer.Deserialize<FoodPost>(result, new JsonSerializerOptions{
            PropertyNameCaseInsensitive = true
        })!;

        return fp;
    }

    public async Task<ICollection<FoodPost>> GetAsync()
    {
        var response = await client.GetAsync("/FoodPosts");
        // Console.Write("API: " + response);
        string content = await response.Content.ReadAsStringAsync();

        // Console.Write("Content: " + content);
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var foodPosts =
            JsonSerializer.Deserialize<ICollection<FoodPost>>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;
        /*
        foreach (var item in foodPostDtos)
        {
            Console.Write("Post: " + item.Title + ": " + item.Category);
        }
        */

        return foodPosts;
    }

    public async Task<FoodPost> GetSingleAsync(int id)
    {
        var response = await client.GetAsync($"/FoodPosts/Single?id={id}");
        // Console.Write("API: " + response);
        string content = await response.Content.ReadAsStringAsync();

        // Console.Write("Content: " + content);
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var foodPost =
            JsonSerializer.Deserialize<FoodPost>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return foodPost;
    }

    public async Task ReserveAsync(FoodPostReservationDto dto)
    {
        string dtoAsJson = JsonSerializer.Serialize(dto);
        var body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");
        Console.Write(body);

        var response = await client.PatchAsync("/FoodPosts/", body);
        Console.Write(response);
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();

            throw new Exception(content);
        }
    }

    public async Task<IEnumerable<FoodPost>> GetAllFoodPostsByUser(string username)
    {
        var response = await client.GetAsync($"/FoodPosts/ByUser?username={username}");
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var foodPosts =
            JsonSerializer.Deserialize<IEnumerable<FoodPost>>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return foodPosts;
    }

    public async Task DeleteAsync(int id)
    {
        var response = await client.DeleteAsync($"/FoodPosts/?id={id}");
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        } 
    }

    public async Task<Report> ReportAsync(Report report)
    {
        var response = await client.PostAsJsonAsync("/FoodPosts/Report", report);
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        } 
        
        var savedReport =
            JsonSerializer.Deserialize<Report>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return savedReport;
    }

    public async Task PickUpAsync(PickUpDto dto)
    {
        string dtoAsJson = JsonSerializer.Serialize(dto);
        var body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");
        Console.Write(body);

        var response = await client.PostAsync("/FoodPosts/Pick", body);
        Console.Write(response);
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
}