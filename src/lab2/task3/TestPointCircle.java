package lab2.task3;

public class TestPointCircle {
    public static void main(String[] args) {
        Circle.Point point1 = new Circle.Point(3, 4);
        Circle.Point point2 = new Circle.Point(-2, 1);

        Circle circle1 = new Circle(point1, 5);
        Circle circle2 = new Circle(point2, 3);

        Circle[] circles = {circle1, circle2};
        int numCircles = circles.length;

        System.out.println("Первая окружность:");
        System.out.println("Центр: (" + circle1.getCenter().getX() + ", " + circle1.getCenter().getY() + ")");
        System.out.println("Радиус: " + circle1.getRadius());
        System.out.println("Площадь: " + circle1.calculateArea());
        System.out.println("Длина окружности: " + circle1.calculateCircleLength());

        System.out.println();

        System.out.println("Вторая окружность:");
        System.out.println("Центр: (" + circle2.getCenter().getX() + ", " + circle2.getCenter().getY() + ")");
        System.out.println("Радиус: " + circle2.getRadius());
        System.out.println("Площадь: " + circle2.calculateArea());
        System.out.println("Длина окружности: " + circle2.calculateCircleLength());

        System.out.println();

        System.out.println("Количество окружностей: " + numCircles);
    }
}
