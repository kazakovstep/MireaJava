package lab2.task7;

public class Shelf {
    private Book[] books;
    private int numBooks;

    public Shelf(int maxSize) {
        books = new Book[maxSize];
        numBooks = 0;
    }

    public int getNumBooks() {
        return numBooks;
    }

    public Book getBook(int index) {
        if (index >= 0 && index < numBooks) {
            return books[index];
        } else {
            return null;
        }
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Книжная полка заполнена, нельзя добавить еще книгу.");
        }
    }

    public Book getLatestBook() {
        Book latestBook = null;
        int latestYear = 0;

        for (int i = 0; i < numBooks; i++) {
            if (books[i].getYear() > latestYear) {
                latestYear = books[i].getYear();
                latestBook = books[i];
            }
        }

        return latestBook;
    }

    public Book getEarliestBook() {
        Book earliestBook = null;
        int earliestYear = Integer.MAX_VALUE;

        for (int i = 0; i < numBooks; i++) {
            if (books[i].getYear() < earliestYear) {
                earliestYear = books[i].getYear();
                earliestBook = books[i];
            }
        }

        return earliestBook;
    }

    public void sortBooksByYear() {
        for (int i = 0; i < numBooks - 1; i++) {
            for (int j = i + 1; j < numBooks; j++) {
                if (books[i].getYear() > books[j].getYear()) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }
}
