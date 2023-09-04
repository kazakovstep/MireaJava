package lab1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для расчета факториала: ");
        int number = scanner.nextInt();// Число, для которого нужно вычислить факториал

        long factorial = calculateFactorial(number); // Вычисляем факториал числа
        if(number >= 0){
            System.out.println("Факториал числа " + number + " равен: " + factorial);
        } else {
            System.out.println("Факториала отрицательного числа не существует");
        }

    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
