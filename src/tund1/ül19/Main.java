package tund1.ül19;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        String response = reader.nextLine();
        int age = Integer.parseInt(response);

        if (age < 0) {
            System.out.println("You can't be " + age + " years old!");
        } else if (age > 120) {
            System.out.println("You're impossibly old! No one is " +  age + " years old!");
        } else {
            System.out.println("Your age seems OK.");
        }


    }
}
