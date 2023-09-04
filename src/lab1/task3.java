package lab1;

public class task3 {
    public static void main(String[] args) {
        // Вывод аргументов командной строки в цикле for
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}
