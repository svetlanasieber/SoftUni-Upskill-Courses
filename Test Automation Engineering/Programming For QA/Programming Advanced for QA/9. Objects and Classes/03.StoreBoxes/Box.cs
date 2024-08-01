public class Box
{
   
    public string SerialNumber { get; set; }
    public Item Item { get; set; } 
    public int ItemQuantity { get; set; }
    public double Price { get; set; } 


    public Box (string serialNumber, Item item, int count)
    {
           SerialNumber = serialNumber;
        Item = item;
        ItemQuantity = count;
        Price = count * item.Price;
    }
}


