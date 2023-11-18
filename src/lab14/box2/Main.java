package lab14.box2;

public class Main {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        String input = "abcdefghijklmnopqrstuv18340";
        boolean isMatch = input.matches(regex);

        if (isMatch) {
            System.out.println("Строка соответствует паттерну.");
        } else {
            System.out.println("Строка не соответствует паттерну.");
        }
    }
}
