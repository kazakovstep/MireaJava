package lab13.box6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordArranger {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(getFileName()))) {
            String line;
            List<String> words = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] wordsInLine = line.split(" ");
                Collections.addAll(words, wordsInLine);
            }

            String result = getLine(words);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла.");
        }
    }

    public static String getFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя файла:");
        String fileName = reader.readLine();
        reader.close();
        return fileName;
    }

    public static String getLine(List<String> words) {
        if (words.isEmpty()) {
            return "";
        }

        StringBuilder resultBuilder = new StringBuilder(words.get(0));
        words.remove(0);

        while (!words.isEmpty()) {
            String lastWord = resultBuilder.substring(resultBuilder.length() - 1).toLowerCase();
            int wordIndex = -1;

            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                if (word.toLowerCase().startsWith(lastWord)) {
                    wordIndex = i;
                    break;
                }
            }

            if (wordIndex == -1) {
                // Не удалось найти слово, которое начинается с последней буквы предыдущего слова
                break;
            }

            String nextWord = words.get(wordIndex);
            resultBuilder.append(" ").append(nextWord);
            words.remove(wordIndex);
        }

        return resultBuilder.toString();
    }
}
