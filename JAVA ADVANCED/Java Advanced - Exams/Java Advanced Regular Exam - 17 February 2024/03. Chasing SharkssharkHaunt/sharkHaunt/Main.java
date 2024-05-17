package sharkHaunt;


public class Main {
    public static void main(String[] args) {


//Initialize the repositories (Basin)
        Basin pacific = new Basin("Pacific Ocean", 6);
        Basin atlantic = new Basin("Atlantic Ocean", 2);
        Basin ganges = new Basin("Ganges River", 1);
//Initialize entities (Shark)
        Shark tigerShark = new Shark("Tiger shark", 300 , "mammals" , "saltwater");
        Shark whaleShark = new Shark("Whale shark", 1200 , "zooplankton" , "saltwater");
        Shark dwarfShark = new Shark("Dwarf lantern shark", 20 , "shrimp" , "saltwater");
        Shark bullShark = new Shark("Bull shark", 330 , "dolphins" , "freshwater");
        Shark gangesShark = new Shark("Ganges shark", 178 , "fish" , "freshwater");

//Add Shark
        pacific.addShark(tigerShark);
        pacific.addShark(whaleShark);
        pacific.addShark(dwarfShark);

        atlantic.addShark(bullShark);

        ganges.addShark(gangesShark);
        ganges.addShark(bullShark);

//Remove Shark
        System.out.println(pacific.removeShark("Carpet shark")); //false

        System.out.println(atlantic.removeShark("Lemon shark")); //false
        System.out.println(atlantic.removeShark("Bull shark")); //true

//Get largest shark
        System.out.println(pacific.getLargestShark().getKind()); //Whale shark

//Get average length of sharks in given basin
        System.out.println(pacific.getAverageLength()); //506

        System.out.println(atlantic.getCount()); //0
//        System.out.println(atlantic.getCapacity()); //2

//Get report for the given basin
        System.out.println(pacific.report());
        System.out.println(ganges.report());

//Sharks in Pacific Ocean:
//This Tiger shark is 300 centimeters long, eats mammals and inhabits SALTWATER.
//This Whale shark is 1200 centimeters long, eats zooplankton and inhabits SALTWATER.
//This Dwarf lantern shark is 20 centimeters long, eats shrimp and inhabits SALTWATER.
//Sharks in Ganges River:
//This Ganges shark is 178 centimeters long, eats fish and inhabits FRESHWATER.
    }
}