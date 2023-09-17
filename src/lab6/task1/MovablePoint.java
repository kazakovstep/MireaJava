package lab6.task1;

import lab6.task1.Movable;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public String toString(){
        return "Объект точка: " +
                "позиция по x и y - " + x + " " + y +
                ", скорость по x - " + xSpeed +
                ", скорость по y - " + ySpeed;
    }


    @Override
    public void moveUp() {
        System.out.println("Объект двигается вверх");
    }

    @Override
    public void moveDown() {
        System.out.println("Объект двигается вниз");
    }

    @Override
    public void moveLeft() {
        System.out.println("Объект двигается влево");
    }

    @Override
    public void moveRight() {
        System.out.println("Объект двигается вправо");
    }
}
