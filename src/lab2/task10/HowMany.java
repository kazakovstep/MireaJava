package lab2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Количество слов: " + wordCount);
    }

    public static int countWords(String input) {
        // Удаляем начальные и конечные пробелы
        input = input.trim();

        // Если строка пустая, возвращаем 0
        if (input.isEmpty()) {
            return 0;
        }

        // Разделяем строку на слова по пробелам
        String[] words = input.split("\\s+");

        // Возвращаем количество слов
        return words.length;
    }
}