package lab7.task567;

import java.util.Scanner;

public class ProcessStrings implements WorkStr{

   public static int kolvo(String str){
       return str.length();
   }

    public static String nechet(String str){
        String str1 = "";
        for(int i = 0; i < str.length(); i+=2){
            str1 += str.charAt(i);
        };
        return str1;
    }

    public static String reverse(String str){
       return new StringBuilder(str).reverse().toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        System.out.println(kolvo(x));
        System.out.println(nechet(x));
        System.out.println(reverse(x));
    }
}
