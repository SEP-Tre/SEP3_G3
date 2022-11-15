using System.Net.Http.Json;
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

    public async Task<FoodPost> Create(FoodPostCreationDTO dto)
    {
        var response = await client.PostAsJsonAsync("/FoodPosts", dto);
        var result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode) throw new Exception(result);

        var fp = JsonSerializer.Deserialize<FoodPost>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return fp;
    }

    public async Task<ICollection<OverSimpleFoodPostDto>> GetAsync()
    {
        var response = await client.GetAsync("/FoodPosts");
        // Console.Write("API: " + response);
        var content = await response.Content.ReadAsStringAsync();
        // Console.Write("Content: " + content);
        if (!response.IsSuccessStatusCode) throw new Exception(content);

        var foodPostDtos =
            JsonSerializer.Deserialize<ICollection<OverSimpleFoodPostDto>>(content, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
        /*
        foreach (var item in foodPostDtos)
        {
            Console.Write("Post: " + item.Title + ": " + item.Category);
        }
        */

        return foodPostDtos;
    }
}