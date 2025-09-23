package part1.week4.ül80;

public class Dice {
    public int sides;
    public Dice(int sides) {
        this.sides = sides;
    }
    public int roll() {
        return (int) (Math.random() * sides + 1);
    }
}
