package lab6.task11;

import java.util.Scanner;

public class Converter implements Convertable{
    @Override
    public double convert(double first){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) - Фаренгейт, 2) - Кельвины");
        int type = scanner.nextInt();
        switch (type){
            case 1:
                return first * 1.8 + 32;
            case 2:
                return first + 273.15;
            default:
                System.out.println("Неверная операция");
                return 1;
        }
    };
}