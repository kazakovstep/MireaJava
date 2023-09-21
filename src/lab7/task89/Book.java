package lab7.task89;

public class Book implements Printable{
    String name;

    String autor;
    int year;

    public Book(String name, String autor, int year) {
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public void print() {
        System.out.println("Книга { название = " + name + ", автор = " + autor + ", год выпуска = " + year + " }");
    }

    public static void printBook(Printable[] printable){
        for (Printable el: printable){
            if(el instanceof Book){
                el.print();
            }
        }
    }
}
