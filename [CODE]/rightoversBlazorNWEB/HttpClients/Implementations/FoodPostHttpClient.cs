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
        var response = await client.PostAsJsonAsync("/FoodPosts", dto);
        var result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode) throw new Exception(result);

        var fp = JsonSerializer.Deserialize<FoodPost>(result, new JsonSerializerOptions{
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
            JsonSerializer.Deserialize<ICollection<OverSimpleFoodPostDto>>(content, new JsonSerializerOptions{
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

    public async Task<FoodPost> GetSingleAsync(int id)
    {
        var response = await client.GetAsync($"/FoodPosts/Single?id={id}");
        // Console.Write("API: " + response);
        var content = await response.Content.ReadAsStringAsync();
        // Console.Write("Content: " + content);
        if (!response.IsSuccessStatusCode) throw new Exception(content);

        var foodPost =
            JsonSerializer.Deserialize<FoodPost>(content, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
        return foodPost;
    }

    public async Task ReserveAsync(int id)
    {
        string idAsJson = JsonSerializer.Serialize(id);
        StringContent body = new StringContent(idAsJson, Encoding.UTF8, "application/json");
        
        HttpResponseMessage response = await client.PatchAsync($"/FoodPosts/{id}", body);
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
}