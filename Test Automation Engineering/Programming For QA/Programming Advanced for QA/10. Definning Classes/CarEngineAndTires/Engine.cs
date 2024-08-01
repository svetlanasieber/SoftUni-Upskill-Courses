namespace CarManufacturer
{
    public class Engine
    {
    
        public int HorsePower { get; set; }
        public double CubicCapacity { get; set; }

        public Engine(int hp, double cubicCapacity)
        {
           
            HorsePower = hp;
            CubicCapacity = cubicCapacity;
        }
    }
}

