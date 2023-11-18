package lab14.box9;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            int frequency = frequencyMap.getOrDefault(c, 0);
            System.out.println(c + ": " + frequency);
        }
    }
}
