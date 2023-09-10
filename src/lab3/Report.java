package lab3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Employee Report:");
        System.out.println("----------------");

        for (Employee employee : employees) {
            System.out.printf("Full Name: %s, Salary: $%,7.2f", employee.getFullName(), employee.getSalary());
            System.out.println();
        }
    }
}
