package lab6.task2;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(
                10, 20, 20, 30, 15, 90, 15, 90
        );
        rect.moveLeft();
        rect.moveDown();
        rect.moveUp();
        rect.moveRight();
        System.out.println(rect);
    }
}
