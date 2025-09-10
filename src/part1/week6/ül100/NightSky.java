package part1.week6.ül100;
import java.util.Random;

public class NightSky {
    double density;
    int width;
    int height;
    int lastPrintStars;
    Random random = new Random();

    NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    NightSky(double density) {
        this(density, 20, 10);
    }

    NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public void printLine() {
        for (int i = 0; i <= width; i++) {
            if (random.nextDouble() < density) {
                lastPrintStars++;
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void print() {
        lastPrintStars = 0;
        for (int i = 0; i <= height; i++) {
            printLine();
        }
    }

    public void starsInLastPrint() {
        System.out.println("Stars in last print: " + lastPrintStars);
    }
}
