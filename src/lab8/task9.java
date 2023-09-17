package lab8;

import java.util.Scanner;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a, b;
        a = scanner.nextInt();//0
        b = scanner.nextInt();//1
        System.out.println(func(a, b));
    }

    public static int func(int a, int b){
        if (a > b+1) return 0;
        if (a==0 || b==0) return 1;
        return func(a,b-1)+func(a-1,b-1);
    }
}
