package lab4_1.task1;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Square";
    }
}
