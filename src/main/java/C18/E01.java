package C18;

import java.util.HashMap;
import java.util.Map;

public class E01 {
    private final String word;

    public E01(String word) {
        this.word = word;
    }

    private Map<Character, Integer> countLetters() {
        return countLetters(0, new HashMap<>());
    }

    private Map<Character, Integer> countLetters(int index, Map<Character, Integer> letters) {
        if (index >= word.length())
            return letters;

        var new_letters = addLettertoLetters(word.charAt(index), letters);
        return countLetters(index + 1, new_letters);
    }

    private Map<Character, Integer> addLettertoLetters(char letter, Map<Character, Integer> letters) {
        letters.computeIfPresent(letter, (k, v) -> v + 1);
        letters.putIfAbsent(letter, 1);
        return letters;
    }

    public boolean isAnagramOf(E01 other) {
        return countLetters().equals(other.countLetters());
    }
}