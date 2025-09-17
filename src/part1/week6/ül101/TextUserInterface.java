package part1.week6.ül101;

import part2.week7.ül7.Dictionary;

import java.util.Locale;
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.print(
                "Statements:\n" +
                        "  add - adds a word pair to the dictionary\n" +
                        "  translate - asks a word and prints its translation\n" +
                        "  quit - quits the text user interface\n"
        );
        while(true) {
            String command = reader.nextLine();
            switch (command.toLowerCase(Locale.ROOT)) {
                case "exit":
                    reader.close();
                    return;
                case "quit":
                    reader.close();
                    return;
                case "add":
                    System.out.print("Enter word: ");
                    String word = reader.nextLine();
                    System.out.print("Enter translation: ");
                    String translation = reader.nextLine();
                    dictionary.add(word, translation);
                    break;
                case "translate":
                    System.out.print("Enter word: ");
                    String key = reader.nextLine();
                    System.out.println(key + " -> " + dictionary.translate(key));
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
