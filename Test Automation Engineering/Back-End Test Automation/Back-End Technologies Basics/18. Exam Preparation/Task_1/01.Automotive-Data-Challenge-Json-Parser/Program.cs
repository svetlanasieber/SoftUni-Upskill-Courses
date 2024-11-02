using System.Text.Json;
using JsonParser.Models;

namespace JsonParser
{
    class Program
    {
        static void Main(string[] args)
        {
            ParseCars();
        }

        // Parses and displays cars data
        private static void ParseCars()
        {
            string jsonFilePath = Path.Combine("Datasets", "Cars.json");
            try
            {
                string json = File.ReadAllText(jsonFilePath);
                List<Car>? cars = JsonSerializer.Deserialize<List<Car>>(json);
                DisplayCars(cars);
            }
            catch (Exception e)
            {
                HandleError(e);
            }
        }

        // Displays the list of cars
        private static void DisplayCars(List<Car>? cars)
        {
            if (cars == null)
            {
                Console.WriteLine("No cars data found or data is not in the expected format.");
                return;
            }

            Console.WriteLine("Cars:");
            for(int i = 0; i < cars.Count; i++)
            {
                Console.WriteLine($"Cars #{i+1}");
                Console.WriteLine($"ID: {cars[i].ModelId} Name: {cars[i].CarName}");
                Console.WriteLine($"Year Manufactured: {cars[i].YearOfManufacture} Fuel Efficiency: {cars[i].FuelEfficiency}");
                string features = string.Join(", ", cars[i].Features);
                Console.WriteLine($"Features: {features}");
            }
        }

        // Handles errors that occur during JSON parsing
        private static void HandleError(Exception e)
        {
            if (e is JsonException)
            {
                Console.WriteLine($"JSON Parsing Error: {e.Message}");
            }
            else
            {
                Console.WriteLine($"An unexpected error occurred: {e.Message}");
            }
        }
    }
}