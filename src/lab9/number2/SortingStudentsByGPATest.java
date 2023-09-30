package lab9.number2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStudentsByGPATest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 4.0));
        students.add(new Student("David", 3.9));

        System.out.println("Before sorting:");
        printStudents(students);

        Collections.sort(students, new SortingStudentsByGPA());

        System.out.println("\nAfter sorting by GPA (descending order):");
        printStudents(students);
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
