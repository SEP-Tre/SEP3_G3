using System.Net;
using System.Xml.Linq;

namespace Domain.DTOs;

public class AddressCoords
{
    private static string API_KEY = "AIzaSyAMkLL4uLLazJ6gBWIAZrj4a2EFZ2SwQBI";
    public float Latitude { get; set; }
    public float Longitude { get; set; }

    public AddressCoords()
    {

    }

    public static AddressCoords ConvertAddressToCoords(AddressCreationDTO addressDto)
    {
        string address =
            addressDto.Street + " " +
            addressDto.StreetNumber + ", " +
            addressDto.PostCode + " " +
            addressDto.City;
        string requestUri =
            string.Format("https://maps.googleapis.com/maps/api/geocode/xml?key={1}&address={0}&sensor=false",
                Uri.EscapeDataString(address), API_KEY);

        WebRequest request = WebRequest.Create(requestUri);
        WebResponse response = request.GetResponse();
        XDocument xdoc = XDocument.Load(response.GetResponseStream());

        XElement result = xdoc.Element("GeocodeResponse").Element("result");
        XElement locationElement = result.Element("geometry").Element("location");
        XElement latXElement = locationElement.Element("lat");
        XElement lngXElement = locationElement.Element("lng");
        AddressCoords coords = new AddressCoords(){
            Latitude = float.Parse(latXElement.Value),
            Longitude = float.Parse(lngXElement.Value)
        };

        return coords;
    }
}