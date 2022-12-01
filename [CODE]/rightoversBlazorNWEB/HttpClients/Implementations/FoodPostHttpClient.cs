using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using AspNetCoreDateAndTimeOnly.Json;
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
        var result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode) throw new Exception(result);
        
        var fp = JsonSerializer.Deserialize<FoodPost>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return fp;
    }

    public async Task<ICollection<FoodPost>> GetAsync()
    {
        var response = await client.GetAsync("/FoodPosts");
        // Console.Write("API: " + response);
        var content = await response.Content.ReadAsStringAsync();

        // Console.Write("Content: " + content);
        if (!response.IsSuccessStatusCode) throw new Exception(content);

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
        var content = await response.Content.ReadAsStringAsync();

        // Console.Write("Content: " + content);
        if (!response.IsSuccessStatusCode) throw new Exception(content);

        var foodPost =
            JsonSerializer.Deserialize<FoodPost>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return foodPost;
    }

    public async Task ReserveAsync(FoodPostReservationDto dto)
    {
        string dtoAsJson = JsonSerializer.Serialize(dto);
        StringContent body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");
        Console.Write(body);

        HttpResponseMessage response = await client.PatchAsync($"/FoodPosts/", body);
        Console.Write(response);
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();

            throw new Exception(content);
        }
    }
}