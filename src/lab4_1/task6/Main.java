package lab4_1.task6;

public class Main {
    public static void main(String[] args) {
        Employer employer = new Employer("Степан", "Петров", 40000);
        Manager manager = new Manager("Владимир", "Попов", 20000, 2000);

        System.out.println("Заработная плата сотрудника: " + employer.getIncome());
        System.out.println("Заработная плата менеджера: " + manager.getIncome());

        Employer[] employees = new Employer[2];
        employees[0] = employer;
        employees[1] = manager;

        for (Employer emp : employees) {
            System.out.println("Заработная плата: " + emp.getIncome());
        }
    }
}
