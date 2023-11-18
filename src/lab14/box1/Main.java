package lab14.box1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        while (true) {
            printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ новой строки после ввода числа

            switch (choice) {
                case 1:
                    printWords(inputString);
                    break;
                case 2:
                    printSentences(inputString);
                    break;
                case 3:
                    printNumbers(inputString);
                    break;
                case 4:
                    printCustomRegex(inputString, scanner);
                    break;
                case 5:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
                    break;
            }

            System.out.println();
        }
    }

    public static void printMenu() {
        System.out.println("Выберите операцию:");
        System.out.println("1. Вывести слова");
        System.out.println("2. Вывести предложения");
        System.out.println("3. Вывести числа");
        System.out.println("4. Ввести свое регулярное выражение");
        System.out.println("5. Выйти");
    }

    public static void printWords(String inputString) {
        String[] words = inputString.split("\\s+");
        System.out.println("Слова:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void printSentences(String inputString) {
        String[] sentences = inputString.split("[.!?]+");
        System.out.println("Предложения:");
        for (String sentence : sentences) {
            System.out.println(sentence.trim());
        }
    }

    public static void printNumbers(String inputString) {
        String[] numbers = inputString.split("\\D+");
        System.out.println("Числа:");
        for (String number : numbers) {
            if (!number.isEmpty()) {
                System.out.println(number);
            }
        }
    }

    public static void printCustomRegex(String inputString, Scanner scanner) {
        System.out.println("Введите регулярное выражение:");
        String regex = scanner.nextLine();

        try {
            String[] matches = inputString.split(regex);
            System.out.println("Совпадения:");
            for (String match : matches) {
                System.out.println(match);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: Некорректное регулярное выражение.");
        }
    }
}
