package part1.week3.ül57;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            String word = reader.nextLine();
            if ( word.isEmpty() ) {
                System.out.println("You typed the following words:");
                words.forEach(System.out::println);
                break;
            } else {
                words.add(word);
            }
        }
    }
}
