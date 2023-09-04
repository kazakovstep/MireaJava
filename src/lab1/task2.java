package lab1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Ввод элементов массива
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int maxElement = arr[0];
        int minElement = arr[0];
        int i = 0;

        // Вычисление суммы элементов циклом do while
        do {
            sum += arr[i];
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
            i++;
        } while (i < size);

        // Вывод результатов
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Минимальный элемент: " + minElement);
    }
}
