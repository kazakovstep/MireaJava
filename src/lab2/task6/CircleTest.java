package lab2.task6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус для Окружности 1: ");
        double radius1 = scanner.nextDouble();
        Circle circle1 = new Circle(radius1);

        System.out.print("Введите радиус для Окружности 2: ");
        double radius2 = scanner.nextDouble();
        Circle circle2 = new Circle(radius2);

        System.out.println("Окружность 1:");
        System.out.println("Радиус: " + circle1.getRadius());
        System.out.println("Площадь: " + circle1.getArea());
        System.out.println("Длина окружности: " + circle1.getPerimeter());

        System.out.println("Окружность 2:");
        System.out.println("Радиус: " + circle2.getRadius());
        System.out.println("Площадь: " + circle2.getArea());
        System.out.println("Длина окружности: " + circle2.getPerimeter());
    }
}
