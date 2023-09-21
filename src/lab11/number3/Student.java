package lab11.number3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private Date birthDate; // Добавляем поле для хранения даты рождения

    // Конструктор
    public Student(String firstName, String lastName, String specialty, int course, String group, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.birthDate = birthDate;
    }

    // Геттеры и сеттеры для полей


    public Date getBirthDate() {
        return birthDate;
    }

    public int getCourse() {
        return course;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    // Метод для получения строкового представления даты рождения
    public String getFormattedBirthDate(String dateFormatPattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatPattern);
        return dateFormat.format(birthDate);
    }

    // Переопределение метода toString() с учетом нового формата вывода
    @Override
    public String toString() {
        return "Студент: " +
                "Имя='" + firstName + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Специальность='" + specialty + '\'' +
                ", Курс=" + course +
                ", Группа='" + group + '\'' +
                ", Дата рождения=" + getFormattedBirthDate("dd.MM.yyyy");
    }
}
