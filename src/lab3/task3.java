package lab3;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        // Создаем массив из 4 случайных целых чисел из отрезка [10;99]
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }

        // Выводим массив на экран в строку
        System.out.println(Arrays.toString(numbers));

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        // Выводим сообщение о результате
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
