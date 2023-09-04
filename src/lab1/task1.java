package lab1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создание динамического массива
        int[] arr = new int[size];

        // Ввод элементов массива
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Вычисление суммы элементов массива
        float sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        // Вычисление среднего арифметического
        float average = sum / size;

        // Вывод результатов
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
