package lab8;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num;

        while (true) {
            num = scanner.nextInt();

            if (num == 0) {
                num = scanner.nextInt();

                if (num == 0) {
                    break;
                }
            }

            if (num == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
