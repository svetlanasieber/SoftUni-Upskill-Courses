public class Program
{
    public static void Main(string[] args)
    {

        List<Box> boxesList = new List<Box>(); //списък с кутии

        string input = Console.ReadLine();

        while (input != "end")
        {
        
            string[] inputData = input.Split();
         
            string serialNumber = inputData[0]; 
            string itemName = inputData[1]; 
            int itemCount = int.Parse(inputData[2]); 
            double itemPrice = double.Parse(inputData[3]); 

           
            Item item = new Item(itemName, itemPrice); 
           
            Box box = new Box(serialNumber, item, itemCount);

          
            boxesList.Add(box);

            input = Console.ReadLine();
        }

        
        List<Box> sortedBoxesList = boxesList.OrderByDescending(box => box.Price).ToList();

        foreach (Box box in sortedBoxesList)
        {
            Console.WriteLine(box.SerialNumber);
            Console.WriteLine($"-- {box.Item.Name} – ${box.Item.Price:F2}: {box.ItemQuantity}");
            Console.WriteLine($"-- ${box.Price:F2}");
        }
    }
}
