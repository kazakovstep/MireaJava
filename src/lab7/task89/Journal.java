package lab7.task89;

public class Journal implements Printable{
    String name;
    int year;

    public Journal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void print(){
        System.out.println("Журнал { название = " + name + ", год выпуска = " + year + " }");
    }
}
