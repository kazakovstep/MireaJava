package lab6.task1;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Объект точка: " +
                "позиция по x и y - " + center.getX() + " " + center.getY() +
                ", скорость по x - " + center.getxSpeed() +
                ", скорость по y - " + center.getySpeed() +
                ", радиус - " + radius;
    }

    @Override
    public void moveUp() {
        System.out.println("Круг двигается вверх");
    }

    @Override
    public void moveDown() {
        System.out.println("Круг двигается вниз");
    }

    @Override
    public void moveLeft() {
        System.out.println("Круг двигается влево");
    }

    @Override
    public void moveRight() {
        System.out.println("Круг двигается вправо");
    }

    public MovablePoint getCenter() {
        return center;
    }
}
