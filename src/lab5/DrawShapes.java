package lab5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawShapes extends JFrame {
    public DrawShapes() {
        super("Random Shapes");

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(700);
            int y = random.nextInt(600);

            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            int shapeType = random.nextInt(3);
            Shape shape = switch (shapeType) {
                case 1 -> new Circle(x, y, 100);
                case 2 -> new Triangle(x, y, 100);
                default -> new Rectangle(x, y, 100, 100);
            };

            shape.draw(g, color);
        }
    }

    abstract class Shape {
        int xPos;
        int yPos;
        public Shape(int x, int y) {
            this.xPos = x;
            this.yPos = y;
        }

        abstract void draw(Graphics g, Color color);
    }

    class Rectangle extends Shape {
        int width;
        int height;

        public Rectangle(int x, int y, int width, int height) {
            super(x, y);
            this.width = width;
            this.height = height;
        }

        void draw(Graphics g, Color color) {
            g.setColor(color);
            g.fillRect(xPos, yPos, width, height);
        }
    }
    class Circle extends Shape {
        int radius;

        public Circle(int x, int y, int radius) {
            super(x, y);
            this.radius = radius;
        }

        void draw(Graphics g, Color color) {
            g.setColor(color);
            g.fillOval(xPos, yPos, radius, radius);
        }
    }

    class Triangle extends Shape {
        int side;
        public Triangle(int x, int y, int side) {
            super(x, y);
            this.side = side;
        }

        void draw(Graphics g, Color color) {
            g.setColor(color);

            int[] xPoints = {xPos, xPos + side, xPos + side / 2};
            int[] yPoints = {yPos + side, yPos + side, yPos};

            g.fillPolygon(xPoints, yPoints, 3);
        }
    }

    public static void main(String[] args) {

        DrawShapes app = new DrawShapes();
        app.setVisible(true);

    }
}
