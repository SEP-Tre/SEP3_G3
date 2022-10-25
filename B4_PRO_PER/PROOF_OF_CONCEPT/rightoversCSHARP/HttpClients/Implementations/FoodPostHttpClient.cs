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
        HttpResponseMessage response = await client.PostAsJsonAsync("/FoodPosts", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        FoodPost fp = JsonSerializer.Deserialize<FoodPost>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return fp;
    }
}