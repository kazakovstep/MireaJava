package lab2.task5;

import lab2.task5.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Dog> dogs = new ArrayList<>();

        boolean addMoreDogs = true;
        while (addMoreDogs) {
            System.out.print("Введите имя собаки: ");
            String name = scanner.nextLine();
            System.out.print("Введите возраст собаки (в годах): ");
            int ageInYears = scanner.nextInt();
            scanner.nextLine();

            Dog dog = new Dog(name, ageInYears);
            dogs.add(dog);

            System.out.print("Добавить еще собаку? (да/нет): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("нет")) {
                addMoreDogs = false;
            }
        }

        for (Dog dog : dogs) {
            System.out.println(dog.getName() + " - " + dog.getAge() + " собачьих лет, " + dog.getHumanAge() + " человеческих лет");
        }

        scanner.close();
    }
}
