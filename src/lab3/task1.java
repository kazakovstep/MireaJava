package lab3;

import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        double[] numbers1 = MathRandom(10);
        double[] numbers2 = ClassRandom(10);

        System.out.println("Original array 1: ");
        printArray(numbers1);

        System.out.println("Original array 2: ");
        printArray(numbers2);

// Method 1: Using Math.random()
        Arrays.sort(numbers1);
        System.out.println("Sorted array 1 (using Math.random()): ");
        printArray(numbers1);

// Method 2: Using Random class
        Arrays.sort(numbers2);
        System.out.println("Sorted array 2 (using Random class): ");
        printArray(numbers2);
    }

    public static double[] MathRandom(int size) {
        double[] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = Math.random();
        }

        return numbers;
    }

    public static double[] ClassRandom(int size) {
        double[] numbers = new double[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextDouble();
        }

        return numbers;
    }

    public static void printArray(double[] numbers) {
        for (double number : numbers) {
            System.out.println(number);
        }
    }
}
