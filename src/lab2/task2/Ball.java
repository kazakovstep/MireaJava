package lab2.task2;

public class Ball {
    private double x; // координата x
    private double y; // координата y

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        this(0.0, 0.0); // вызываем конструктор с параметрами, передавая значения 0.0, 0.0
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

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball: (" + x + ", " + y + ")";
    }
}
