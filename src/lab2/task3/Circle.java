package lab2.task3;

import java.util.Random;

class Circle {
    static class Point{
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
    private Point center;
    private double radius;

    public Circle(Point center) {
        this.center = center;
        Random random = new Random();
        this.radius = random.nextDouble() * 100;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircleLength() {
        return 2 * Math.PI * radius;
    }
///////////////////////////////////////////////////
    // Метод для поиска самой маленькой окружности в массиве
    public static Circle findSmallestCircle(Circle[] circles) {
        Circle smallestCircle = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }
        return smallestCircle;
    }

    // Метод для поиска самой большой окружности в массиве
    public static Circle findLargestCircle(Circle[] circles) {
        Circle largestCircle = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }
        return largestCircle;
    }

    // Метод для упорядочивания хранения окружностей в массиве
    public static void sortCircles(Circle[] circles) {
        for (int i = 0; i < circles.length - 1; i++) {
            for (int j = i + 1; j < circles.length; j++) {
                if (circles[j].getRadius() < circles[i].getRadius()) {
                    Circle temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
            }
        }
    }

}
