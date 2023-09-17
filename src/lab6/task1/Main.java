package lab6.task1;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(15, 20, 23, 41, 50);
        circle.moveLeft();
        circle.moveDown();
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);
    }
}