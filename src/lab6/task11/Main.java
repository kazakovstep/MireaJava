package lab6.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество градусов в Цельсиях: ");
        double angle = scanner.nextDouble();
        Converter converter = new Converter();
        System.out.println(converter.convert(angle));
    }
}
