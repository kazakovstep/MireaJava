package lab13.box1;

public class Main {
    public static void main(String[] args) {
        firstEx("I like Java!!!");
    }

    public static void firstEx(String myString){
        System.out.println(myString);
        System.out.println("Последний символ строки: " + myString.charAt(myString.length() - 1));
        if (myString.endsWith("!!!") & myString.startsWith("I like")){
            System.out.println("Строка заканчивается символами: !!! и начинается с: I like");
        }
        else {
            System.out.println("Строка не заканчивается символами: !!! или не начинается с: I like");
        }

        if(myString.contains("Java")){
            System.out.println("Строка содержит подстроку Java");
        }
        else {
            System.out.println("Строка не содержит подстроку Java");
        }

        System.out.println("Позиция подстроки: " + myString.indexOf("Java"));
        System.out.println(myString.replace("a", "b"));
        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());
        String java = myString.substring(7, 11);
        System.out.println(java);
    }
}
