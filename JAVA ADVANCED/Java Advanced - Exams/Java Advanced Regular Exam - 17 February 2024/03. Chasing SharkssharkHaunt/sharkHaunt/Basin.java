package sharkHaunt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basin {

    private final List<Shark> sharks;
    private final String name;
    private final int capacity;




    public Basin(String name, int capacity) {
        this.sharks = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public void addShark(Shark shark) {

        if (sharks.size() >= capacity) {
            System.out.println(("This basin is at full capacity!"));
        } else {
                sharks.add(shark);
        }
    }

    public Shark getShark(String kind) {
        return sharks.stream().filter(f -> f.getKind().equals(kind)).findFirst().orElse(null);
    }

    public boolean removeShark(String kind) {
        Shark shark = this.getShark(kind);
        sharks.remove(shark);
        return shark != null;
    }

    public Shark getLargestShark() {
        return sharks.stream().max(Comparator.comparing(Shark::getLength)).orElse(null);
    }

    public int getCount(){
        return sharks.size();
    }

    public int getAverageLength() {
        return (int) sharks.stream().mapToDouble(Shark::getLength).average().orElse(0);
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String report() {

        Basin basin = new Basin(getName(), getCapacity());

        StringBuilder build = new StringBuilder();
        build.append("Sharks in " + basin.getName() + ":");
        build.append(System.lineSeparator());
        sharks.forEach(shark -> build.append(shark.toString()).append(String.format(System.lineSeparator())));
        return build.toString().trim();
    }
}
