package part1.week2.ül26;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number to start adding numbers together, enter 0 to exit.");
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }

            sum += read;

            System.out.println("Sum now: " + sum);
            System.out.println("Enter the next number to add.");
        }

        System.out.println("Sum in the end: " + sum);
    }
}
