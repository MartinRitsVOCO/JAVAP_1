package part2.week7.ül4;

import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {
    private final int maxWeight;
    private final ArrayList<Thing> things = new ArrayList<>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing: things) totalWeight += thing.getWeight();
        return totalWeight;
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }
    public String toString() {
        return switch (things.size()) {
            case 0 -> "Empty (0 kg)";
            case 1 -> String.format("1 thing (%d kg)", totalWeight());
            default -> String.format("%d things (%d kg)", things.size(), totalWeight());
        };
    }
    public void printThings() {
        things.forEach(System.out::println);
    }
    public Thing heaviestThing() {
        return things.stream().max(Comparator.comparingInt(Thing::getWeight)).orElse(null);
    }
}
