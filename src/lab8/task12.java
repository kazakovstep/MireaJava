package lab8;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        input.close();
    }
}
