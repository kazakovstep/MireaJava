package lab2.task7;

import java.util.Scanner;

public class Booktest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите максимальное количество книг на полке: ");
        int maxSize = scanner.nextInt();
        Shelf bookshelf = new Shelf(maxSize);

        while (true) {
            System.out.println("\\nВыберите действие:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Получить книгу с самым поздним сроком издания");
            System.out.println("3. Получить книгу с самым ранним сроком издания");
            System.out.println("4. Отсортировать книги по году выпуска");
            System.out.println("5. Выйти");

            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine(); // чтобы очистить новую строку после ввода числа
                System.out.print("Введите автора книги: ");
                String author = scanner.nextLine();
                System.out.print("Введите название книги: ");
                String title = scanner.nextLine();
                System.out.print("Введите год написания книги: ");
                int year = scanner.nextInt();

                Book book = new Book(author, title, year);
                bookshelf.addBook(book);
                System.out.println("Книга успешно добавлена на полку.");
            } else if (choice == 2) {
                Book latestBook = bookshelf.getLatestBook();
                if (latestBook != null) {
                    System.out.println("Книга с самым поздним сроком издания:");
                    System.out.println("Автор: " + latestBook.getAuthor());
                    System.out.println("Название: " + latestBook.getTitle());
                    System.out.println("Год написания: " + latestBook.getYear());
                } else {
                    System.out.println("На полке нет книг.");
                }
            } else if (choice == 3) {
                Book earliestBook = bookshelf.getEarliestBook();
                if (earliestBook != null) {
                    System.out.println("Книга с самым ранним сроком издания:");
                    System.out.println("Автор: " + earliestBook.getAuthor());
                    System.out.println("Название: " + earliestBook.getTitle());
                    System.out.println("Год написания: " + earliestBook.getYear());
                } else {
                    System.out.println("На полке нет книг.");
                }
            } else if (choice == 4) {
                bookshelf.sortBooksByYear();
                System.out.println("Книги на полке отсортированы по году выпуска.");
                System.out.println("Список книг:");
                for (int i = 0; i < bookshelf.getNumBooks(); i++) {
                    Book book = bookshelf.getBook(i);
                    if (book != null) {
                        System.out.println("Автор: " + book.getAuthor());
                        System.out.println("Название: " + book.getTitle());
                        System.out.println("Год написания: " + book.getYear());
                        System.out.println("----------------");
                    }
                }
            }
            else if (choice == 5) {
                break;
            }
        }
}}
