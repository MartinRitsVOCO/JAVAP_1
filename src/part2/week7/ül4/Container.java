package part2.week7.ül4;

import java.util.ArrayList;

public class Container {
    private final int maxWeight;
    private final ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        return suitcases.stream().mapToInt(Suitcase::totalWeight).sum();
    }
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }
    public String toString() {
        return switch (suitcases.size()) {
            case 0 -> "No suitcases";
            case 1 -> String.format("%d suitcase (%d kg)", suitcases.size(), totalWeight());
            default -> String.format("%d suitcases (%d kg)", suitcases.size(), totalWeight());
        };
    }
    public void printThings() {
        suitcases.forEach(Suitcase::printThings);
    }
}
