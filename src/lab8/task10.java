package lab8;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int reversed = reverse(n);
        System.out.println(reversed);
    }

    public static int reverse(int n) {
        if (n < 10) {
            return n;
        }

        int lastDigit = n % 10;
        int remainingDigits = n / 10;

        int reversedRemaining = reverse(remainingDigits);

        String reversedString = String.valueOf(reversedRemaining);
        reversedString += String.valueOf(lastDigit);

        return Integer.parseInt(reversedString);
    }
}
