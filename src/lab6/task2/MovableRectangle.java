package lab6.task2;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed, int x2Speed, int y2Speed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, x2Speed, y2Speed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topleft=" + topLeft +
                ", topright=" + bottomRight +
                '}';
    }


    @Override
    public void moveUp() {
        if (topLeft.getxSpeed() == bottomRight.getxSpeed() && topLeft.getySpeed() == bottomRight.getySpeed()){
            System.out.println("Прямоугольник двигается вверх");
        }
        else{
            System.out.println("Неверны заданы координаты точкам прямоугольника");
        }
    }

    @Override
    public void moveDown() {
        if (topLeft.getxSpeed() == bottomRight.getxSpeed() && topLeft.getySpeed() == bottomRight.getySpeed()){
            System.out.println("Прямоугольник двигается вниз");
        }
        else{
            System.out.println("Неверны заданы координаты точкам прямоугольника");
        }
    }

    @Override
    public void moveLeft() {
        if (topLeft.getxSpeed() == bottomRight.getxSpeed() && topLeft.getySpeed() == bottomRight.getySpeed()){
            System.out.println("Прямоугольник двигается влево");
        }
        else{
            System.out.println("Неверны заданы координаты точкам прямоугольника");
        }
    }

    @Override
    public void moveRight() {
        if (topLeft.getxSpeed() == bottomRight.getxSpeed() && topLeft.getySpeed() == bottomRight.getySpeed()){
            System.out.println("Прямоугольник двигается вправо");
        }
        else{
            System.out.println("Неверны заданы координаты точкам прямоугольника");
        }
    }
}
