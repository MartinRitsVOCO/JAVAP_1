package part2.week7.ül7;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private final HashMap<String, String> words = new HashMap<>();

    public void add(String word, String translation) {
        words.put(word, translation);
    }
    public String translate(String word) {
        return words.get(word);
    }
    public int amountOfWords() {
        return words.size();
    }

    public ArrayList<String> translationList() {
        return new ArrayList<>(words.entrySet().stream().map(entry -> String.format("%s = %s", entry.getKey(), entry.getValue())).toList());
    }
}
