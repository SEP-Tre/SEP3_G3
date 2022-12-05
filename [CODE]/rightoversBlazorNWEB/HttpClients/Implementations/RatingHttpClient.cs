using System.Net.Http.Json;
using System.Text.Json;
using Domain.Classes;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class RatingHttpClient : IRatingService
{
    private readonly HttpClient client;

    public RatingHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<Rating> AddRating(Rating rating)
    {
        var response = await client.PostAsJsonAsync("/Ratings", rating);
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var savedRating =
            JsonSerializer.Deserialize<Rating>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return savedRating;
    }

    public async Task<List<Rating>> GetAllByUserRated(string username)
    {
        var response = await client.GetAsync($"BeingRated/{username}");
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var ratings =
            JsonSerializer.Deserialize<List<Rating>>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return ratings;
    }

    public async Task<List<Rating>> GetAllByUserRating(string username)
    {
        var response = await client.GetAsync($"MakingRating/{username}");
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var ratings =
            JsonSerializer.Deserialize<List<Rating>>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return ratings;
    }
}