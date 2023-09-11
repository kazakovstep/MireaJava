package lab4_1.task7;

public class StudyPeople {
    private String name;
    private int age;

    public StudyPeople(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Возраст: " + age;
    }
}
