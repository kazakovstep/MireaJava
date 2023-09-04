package lab2.task1;

import lab2.task1.Author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя автора: ");
        String name = scanner.nextLine();

        System.out.print("Введите email автора: ");
        String email = scanner.nextLine();

        System.out.print("Введите пол автора (M или Ж): ");
        char gender = scanner.nextLine().charAt(0);

        Author author = new Author(name, email, gender);

        System.out.println(author.toString());

        scanner.close();
    }
}
