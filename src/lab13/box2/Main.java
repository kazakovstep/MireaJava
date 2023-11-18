package lab13.box2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        System.out.println(person1.getFormattedName());  // Иванов И.И.

        Person person2 = new Person("Петров", "Петр", null);
        System.out.println(person2.getFormattedName());  // Петров П.

        Person person3 = new Person("Сидоров", null, null);
        System.out.println(person3.getFormattedName());  // Сидоров

        Person person4 = new Person(null, null, null);
        System.out.println(person4.getFormattedName());  // (пустая строка)
    }
}
