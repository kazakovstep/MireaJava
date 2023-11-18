package lab17.box1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student student = DataBAse();

        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.println("\nAfter updaiting");

        controller.setStudentName("Rudolf");
        controller.updateView();
    }

    static public Student DataBAse(){
        Student student = new Student();
        student.setName("Nick");
        student.setRollNo("09D12a");
        return student;
    }
}
