package lab14.box3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Список цен: 25.98 USD, 100 RUB, 10.50 EU";

        // Регулярное выражение для извлечения цен в формате USD
        String usdRegex = "\\b(\\d+\\.\\d+)\\s+USD\\b";

        // Регулярное выражение для извлечения цен в формате RUB
        String rubRegex = "\\b(\\d+)\\s+RUB\\b";

        // Регулярное выражение для извлечения цен в формате EU
        String euRegex = "\\b(\\d+\\.\\d+)\\s+EU\\b";

        // Поиск соответствий в тексте
        Pattern usdPattern = Pattern.compile(usdRegex);
        Matcher usdMatcher = usdPattern.matcher(text);

        Pattern rubPattern = Pattern.compile(rubRegex);
        Matcher rubMatcher = rubPattern.matcher(text);

        Pattern euPattern = Pattern.compile(euRegex);
        Matcher euMatcher = euPattern.matcher(text);

        // Извлечение цен в USD
        while (usdMatcher.find()) {
            String price = usdMatcher.group(1);
            System.out.println("Цена в USD: " + price);
        }

        // Извлечение цен в RUB
        while (rubMatcher.find()) {
            String price = rubMatcher.group(1);
            System.out.println("Цена в RUB: " + price);
        }

        // Извлечение цен в EU
        while (euMatcher.find()) {
            String price = euMatcher.group(1);
            System.out.println("Цена в EU: " + price);
        }
    }
}