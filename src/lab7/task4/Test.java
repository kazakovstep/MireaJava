package lab7.task4;

import java.util.Scanner;

public class Test implements MathCalculable{

    public static double pow(int x, int y){
        return Math.pow(x,y);
    }

    public static void main(String[] args) {
        Circle cr1 = new Circle(3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Что вам нужно(1-площадь, 2-длинна)?");
        int x = sc.nextInt();

        switch (x){
            case 1:
                System.out.println( pi*pow(cr1.getR(), 2)); break;
            case 2:
                System.out.println(2*pi* cr1.getR()); break;
        }
    }
}
