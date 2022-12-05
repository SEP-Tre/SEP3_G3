using System.Net;
using System.Xml.Linq;

namespace Domain.DTOs;

public class AddressCoords
{
    private readonly static string API_KEY = "AIzaSyAMkLL4uLLazJ6gBWIAZrj4a2EFZ2SwQBI";

    public float Latitude { get; set; }
    public float Longitude { get; set; }

    public static AddressCoords ConvertAddressToCoords(AddressCreationDto addressDto)
    {
        string address =
            addressDto.Street + " " +
            addressDto.StreetNumber + ", " +
            addressDto.PostCode + " " +
            addressDto.City;
        string requestUri =
            string.Format("https://maps.googleapis.com/maps/api/geocode/xml?key={1}&address={0}&sensor=false",
                Uri.EscapeDataString(address), API_KEY);

        var request = WebRequest.Create(requestUri);
        var response = request.GetResponse();
        var xdoc = XDocument.Load(response.GetResponseStream());

        var result = xdoc.Element("GeocodeResponse").Element("result");
        var locationElement = result.Element("geometry").Element("location");
        var latXElement = locationElement.Element("lat");
        var lngXElement = locationElement.Element("lng");
        var coords = new AddressCoords{
            Latitude = float.Parse(latXElement.Value),
            Longitude = float.Parse(lngXElement.Value)
        };

        return coords;
    }
}