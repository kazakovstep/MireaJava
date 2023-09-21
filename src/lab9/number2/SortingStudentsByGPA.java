package lab9.number2;

import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем по итоговому баллу (GPA) в порядке убывания
        if (student1.getGPA() < student2.getGPA()) {
            return 1; // Первый студент имеет больший GPA
        } else if (student1.getGPA() > student2.getGPA()) {
            return -1; // Второй студент имеет больший GPA
        } else {
            return 0; // GPA студентов равны
        }
    }
}
