package lab14.box4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "(1 + 8) - 9 / 4";

        // Регулярное выражение для поиска цифр без знака "+"
        String regex = "(?<![+])\\b(\\d+)\\b";

        // Поиск соответствий в тексте
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Проверка наличия цифр без знака "+"
        while (matcher.find()) {
            String number = matcher.group(1);
            System.out.println("Цифра без знака '+': " + number);
        }
    }
}