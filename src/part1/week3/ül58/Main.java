package part1.week3.ül58;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            String word = reader.nextLine().trim();
            if (words.contains(word)) {
                System.out.printf("You gave the word %s twice%n", word);
                break;
            } else if (word.isEmpty()) {
                System.out.println("You typed the following words:");
                words.forEach(System.out::println);
                break;
            } else {
                words.add(word);
            }
        }
    }
}