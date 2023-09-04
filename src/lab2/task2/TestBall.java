package lab2.task2;

import lab2.task2.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(); // создаем объект мяч с координатами (0.0, 0.0)
        Ball ball2 = new Ball(2.5, 4.2); // создаем объект мяч с координатами (2.5, 4.2)

        System.out.println(ball1); // выводим информацию о мяче
        System.out.println(ball2); // выводим информацию о мяче

        ball1.setXY(1.2, 3.5); // устанавливаем новые координаты для мяча
        ball1.move(0.5, 1.0); // перемещаем мяч на заданное расстояние

        System.out.println(ball1); // выводим информацию о мяче
    }
}
