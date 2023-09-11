package lab4_1.task7;

public class Main {
    public static void main(String[] args) {
        StudyPeople[] studyPeople = new StudyPeople[4];
        studyPeople[0] = new School("Степан", 15, 9);
        studyPeople[1] = new School("Владимир", 14, 8);
        studyPeople[2] = new Student("Степан", 20, "МИРЭА");
        studyPeople[3] = new Student("Владимир", 19, "МФТИ");

        System.out.println("Школьники:");
        for (StudyPeople people : studyPeople) {
            if (people instanceof School) {
                School School = (School) people;
                System.out.println(School);
            }
        }

        System.out.println("\nСтуденты:");
        for (StudyPeople people : studyPeople) {
            if (people instanceof Student) {
                Student student = (Student) people;
                System.out.println(student);
            }
        }
    }
}
