package lab4_1.task7;

public class School extends StudyPeople{
    private Integer classs;

    public School(String name, int age, int classs) {
        super(name, age);
        this.classs = classs;
    }

    public int get_class() {
        return classs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Класс: " + classs;
    }
}
