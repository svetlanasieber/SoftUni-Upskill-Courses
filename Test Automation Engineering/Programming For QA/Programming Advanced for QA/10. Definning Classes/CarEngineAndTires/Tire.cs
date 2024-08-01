namespace CarManufacturer
{
    public class Tire
    {
       
        public int Year { get; set; }
        public double Pressure { get; set; }

       
        public Tire(int year, double pressure)
        {
            
            Year = year;
            Pressure = pressure;
        }
    }
}

