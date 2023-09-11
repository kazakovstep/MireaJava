package lab4_1.task5;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Степан", 15, "Факультет информатики", "05.07.8145", "8 800 555 35 35");

        reader.takeBook(3);
        reader.takeBook("Приключения", "Словарь", "Энциклопедия");

        Book book1 = new Book("Приключения", "Пушкин");
        Book book2 = new Book("Словарь", "Лермонтов");
        Book book3 = new Book("Энциклопедия", "Гоголь");

        reader.takeBook(book1, book2, book3);

        reader.returnBook(2);
        reader.returnBook("Приключения", "Словарь");
        reader.returnBook(book1, book2);
    }
}