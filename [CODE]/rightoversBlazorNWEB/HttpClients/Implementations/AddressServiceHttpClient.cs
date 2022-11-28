using System.Data;
using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using Domain.DTOs;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class AddressServiceHttpClient : IAddressService
{
    private static string GEOCODE_API_KEY = "AIzaSyAMkLL4uLLazJ6gBWIAZrj4a2EFZ2SwQBI";
    private readonly HttpClient client;

    public AddressServiceHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<AddressCreationDTO> CreateAsync(AddressCreationDTO addressDto)
    {
        // Set the coordinates for the new address
        string address =
            addressDto.Street + "+" +
            addressDto.StreetNumber + ",+" +
            addressDto.PostCode + "+" +
            addressDto.City;
        string requestUri =
            string.Format("https://maps.googleapis.com/maps/api/geocode/xml?key={1}&address={0}&sensor=false",
                Uri.EscapeDataString(address), GEOCODE_API_KEY);

        var response = await client.GetStreamAsync(requestUri);
        Encoding encode = System.Text.Encoding.GetEncoding("utf-8");

        StreamReader readstream = new StreamReader(response, encode);

        DataSet dsResult = new DataSet();

        dsResult.ReadXml(readstream);

        response.Close();
        readstream.Close();

        Tuple<double, double> output = new Tuple<double, double>(0, 0);

        DataTable dt = new DataTable();

        foreach (DataRow row in dsResult.Tables["result"].Rows)
        {
            string geometry_id =
                dsResult.Tables["geometry"].Select("result_id = " + row["result_id"].ToString())[0]["geometry_id"]
                    .ToString();

            DataRow location = dsResult.Tables["location"].Select("geometry_id=" + geometry_id)[0];

            output = Tuple.Create(Convert.ToDouble(location["lat"]), Convert.ToDouble(location["lng"]));

            Console.WriteLine(output);

            addressDto.Latitude = Convert.ToDouble(location["lat"]);
            addressDto.Longitude = Convert.ToDouble(location["lng"]);
        }
        
        // Persist the address
        var response2 = await client.PostAsJsonAsync("/Address", addressDto);
        var result = await response2.Content.ReadAsStringAsync();

        if (!response2.IsSuccessStatusCode) throw new Exception(result);

        var address2 = JsonSerializer.Deserialize<AddressCreationDTO>(result, new JsonSerializerOptions{
            PropertyNameCaseInsensitive = true
        })!;

        return address2;
    }

    public async Task<ICollection<AddressCreationDTO>> GetAsync()
    {
        var response = await client.GetAsync("/Address");
        var content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode) throw new Exception(content);

        var addressDtos =
            JsonSerializer.Deserialize<ICollection<AddressCreationDTO>>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return addressDtos;
    }

    public async Task<AddressCreationDTO> GetCoordsAsync(AddressCreationDTO addressDto)
    {
        string address =
            addressDto.Street + "+" +
            addressDto.StreetNumber + ",+" +
            addressDto.PostCode + "+" +
            addressDto.City;
        string requestUri =
            string.Format("https://maps.googleapis.com/maps/api/geocode/xml?key={1}&address={0}&sensor=false",
                Uri.EscapeDataString(address), GEOCODE_API_KEY);

        var response = await client.GetStreamAsync(requestUri);
        Encoding encode = System.Text.Encoding.GetEncoding("utf-8");

        StreamReader readstream = new StreamReader(response, encode);

        DataSet dsResult = new DataSet();

        dsResult.ReadXml(readstream);

        response.Close();
        readstream.Close();

        Tuple<double, double> output = new Tuple<double, double>(0, 0);

        DataTable dt = new DataTable();

        foreach (DataRow row in dsResult.Tables["result"].Rows)
        {
            string geometry_id =
                dsResult.Tables["geometry"].Select("result_id = " + row["result_id"].ToString())[0]["geometry_id"]
                    .ToString();

            DataRow location = dsResult.Tables["location"].Select("geometry_id=" + geometry_id)[0];

            output = Tuple.Create(Convert.ToDouble(location["lat"]), Convert.ToDouble(location["lng"]));

            Console.WriteLine(output);

            addressDto.Latitude = Convert.ToDouble(location["lat"]);
            addressDto.Longitude = Convert.ToDouble(location["lng"]);
        }

        ;

        return addressDto;
    }
}