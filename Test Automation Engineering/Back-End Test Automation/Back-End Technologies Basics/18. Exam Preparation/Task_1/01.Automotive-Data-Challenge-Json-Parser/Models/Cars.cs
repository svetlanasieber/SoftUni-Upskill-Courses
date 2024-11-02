using System.Text.Json.Serialization;

namespace JsonParser.Models
{
    public class Car
    {
        [JsonPropertyName("modelId")]
        public int ModelId { get; set; }

        [JsonPropertyName("carName")]
        public string CarName { get; set; }

        [JsonPropertyName("yearOfManufacture")]
        public int YearOfManufacture { get; set; }

        [JsonPropertyName("fuelEfficiency")]
        public double FuelEfficiency { get; set; }

        [JsonPropertyName("features")]
        public List<string> Features { get; set; }
    }
}
