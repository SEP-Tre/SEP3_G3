﻿using System.Data;
using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using Domain.Classes;
using Domain.DTOs;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class AddressServiceHttpClient : IAddressService
{
    private readonly static string GEOCODE_API_KEY = "AIzaSyAMkLL4uLLazJ6gBWIAZrj4a2EFZ2SwQBI";
    private readonly HttpClient client;

    public AddressServiceHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<AddressCreationDto> CreateAsync(AddressCreationDto? addressDto)
    {
        Console.WriteLine("Address service: " + addressDto.toString());
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
        var encode = Encoding.GetEncoding("utf-8");

        var readstream = new StreamReader(response, encode);

        var dsResult = new DataSet();

        dsResult.ReadXml(readstream);

        response.Close();
        readstream.Close();

        var output = new Tuple<double, double>(0, 0);

        var dt = new DataTable();

        foreach (DataRow row in dsResult.Tables["result"].Rows)
        {
            string geometry_id =
                dsResult.Tables["geometry"].Select("result_id = " + row["result_id"])[0]["geometry_id"]
                    .ToString();

            var location = dsResult.Tables["location"].Select("geometry_id=" + geometry_id)[0];

            output = Tuple.Create(Convert.ToDouble(location["lat"]), Convert.ToDouble(location["lng"]));

            Console.WriteLine(output);

            addressDto.Latitude = Convert.ToDouble(location["lat"]);
            addressDto.Longitude = Convert.ToDouble(location["lng"]);
        }

        // Persist the address
        var response2 = await client.PostAsJsonAsync("/Address", addressDto);
        string result = await response2.Content.ReadAsStringAsync();

        if (!response2.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        var address2 = JsonSerializer.Deserialize<AddressCreationDto>(result, new JsonSerializerOptions{
            PropertyNameCaseInsensitive = true
        })!;

        return address2;
    }

    public async Task<ICollection<AddressCreationDto>> GetAsync()
    {
        var response = await client.GetAsync("/Address");
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var addressDtos =
            JsonSerializer.Deserialize<ICollection<AddressCreationDto>>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return addressDtos;
    }

    public async Task<AddressCreationDto> GetCoordsAsync(AddressCreationDto addressDto)
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
        var encode = Encoding.GetEncoding("utf-8");

        var readstream = new StreamReader(response, encode);

        var dsResult = new DataSet();

        dsResult.ReadXml(readstream);

        response.Close();
        readstream.Close();

        var output = new Tuple<double, double>(0, 0);

        var dt = new DataTable();

        foreach (DataRow row in dsResult.Tables["result"].Rows)
        {
            string geometry_id =
                dsResult.Tables["geometry"].Select("result_id = " + row["result_id"])[0]["geometry_id"]
                    .ToString();

            var location = dsResult.Tables["location"].Select("geometry_id=" + geometry_id)[0];

            output = Tuple.Create(Convert.ToDouble(location["lat"]), Convert.ToDouble(location["lng"]));

            Console.WriteLine(output);

            addressDto.Latitude = Convert.ToDouble(location["lat"]);
            addressDto.Longitude = Convert.ToDouble(location["lng"]);
        }

        ;

        return addressDto;
    }
    
    // TODO: Persist this correctly
    public async Task<Address> SetCoordsOnExisting(Address addressIn)
    {
        string address =
            addressIn.Street + "+" +
            addressIn.StreetNumber + ",+" +
            addressIn.PostCode + "+" +
            addressIn.City;
        string requestUri =
            string.Format("https://maps.googleapis.com/maps/api/geocode/xml?key={1}&address={0}&sensor=false",
                Uri.EscapeDataString(address), GEOCODE_API_KEY);

        var response = await client.GetStreamAsync(requestUri);
        var encode = Encoding.GetEncoding("utf-8");

        var readstream = new StreamReader(response, encode);

        var dsResult = new DataSet();

        dsResult.ReadXml(readstream);

        response.Close();
        readstream.Close();

        var output = new Tuple<double, double>(0, 0);

        var dt = new DataTable();

        foreach (DataRow row in dsResult.Tables["result"].Rows)
        {
            string geometry_id =
                dsResult.Tables["geometry"].Select("result_id = " + row["result_id"])[0]["geometry_id"]
                    .ToString();

            var location = dsResult.Tables["location"].Select("geometry_id=" + geometry_id)[0];

            output = Tuple.Create(Convert.ToDouble(location["lat"]), Convert.ToDouble(location["lng"]));

            Console.WriteLine(output);

            addressIn.Latitude = Convert.ToDouble(location["lat"]);
            addressIn.Longitude = Convert.ToDouble(location["lng"]);
        }
        
        return addressIn;
    }
}