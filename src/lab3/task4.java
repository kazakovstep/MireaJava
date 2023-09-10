package lab3;

import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Просим пользователя ввести размер массива, пока он не введет натуральное число больше 0
        while (n <= 0) {
            System.out.print("Введите размер массива: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            } else {
                scanner.nextLine();
            }
        }

        // Создаем массив из n случайных целых чисел из отрезка [0; n]
        int[] numbers = new int[n];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(n + 1); // [0; n]
        }

        // Выводим первый массив на экран
        System.out.print("Первый массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Создаем второй массив только из четных элементов первого массива
        int[] chet = new int[n]; // Максимально возможное количество четных элементов - n
        int count = 0; // Количество четных элементов во втором массиве
        for (int number : numbers) {
            if (number % 2 == 0) {
                chet[count] = number;
                count++;
            }
        }

        // Выводим второй массив на экран
        System.out.print("Второй массив (четные элементы): ");
        for (int i = 0; i < count; i++) {
            System.out.print(chet[i] + " ");
        }
        System.out.println();
    }
}
