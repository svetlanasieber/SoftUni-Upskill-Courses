package sharkHaunt;

public class Shark {

    private final String kind;
    private final int length;
    private final String food;
    private final String habitation;



    public Shark(String kind, int length, String food, String habitation) {
        this.kind = kind;
        this.length = length;
        this.food = food;
        this.habitation = habitation;
    }

    public String getKind() { return kind;}
    public int getLength() { return length;}
    public String getFood() { return food;}
    public String getHabitation() {return habitation;}

    @Override
    public String toString() {
        return String.format("The %s is %d centimeters long, eats %s and inhabits %s." , kind, length, food, habitation);
    }
}
