package lab7.task89;

public class Test {
    public static void main(String[] args) {
        Book bk = new Book("awd", "adwd", 213);
        Printable[] print = new Printable[]{
                new Book("Война и мир", "Толстой Л.Н.", 1867),
                new Journal("Ландыш", 1987),
                new Book("Капитанская дочка", "Пушкин А.С.", 1836),
                new Journal("Мотылёк", 2003)
        };

        System.out.println("Метод для вывода журналов:");
        printMagazines(print);
        System.out.println("\nМетод для вывода книг:");
        bk.printBook(print);
    }

    public static void printMagazines(Printable[] printable){
        for (Printable el: printable){
            if(el instanceof Journal){
                el.print();
            }
        }
    }
}
