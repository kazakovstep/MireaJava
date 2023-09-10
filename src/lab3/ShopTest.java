package lab3;

public class ShopTest {
        public static void main(String[] args) {
            Employee[] employees = new Employee[3];
            employees[0] = new Employee("John Smith", 5000);
            employees[1] = new Employee("Mary Johnson", 6000);
            employees[2] = new Employee("Peter Davis", 5500);

            Report.generateReport(employees);
        }
}
