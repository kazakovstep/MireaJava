package lab2.task4;

import lab2.task4.Computer;
import lab2.task4.Shop;

import java.util.Scanner;

public class TesterShop {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество компьютеров для добавления в магазин: ");
        int numComputers = scanner.nextInt();

        for (int i = 0; i < numComputers; i++) {
            System.out.println("Введите информацию о компьютере " + (i + 1));

            System.out.print("Бренд: ");
            String brand = scanner.next();

            System.out.print("Модель: ");
            String model = scanner.next();

            Computer computer = new Computer(brand, model);
            shop.addComputer(computer);
        }

        System.out.println();

        System.out.print("Введите бренд компьютера для поиска: ");
        String searchBrand = scanner.next();

        System.out.print("Введите модель компьютера для поиска: ");
        String searchModel = scanner.next();

        Computer foundComputer = shop.findComputer(searchBrand, searchModel);

        if (foundComputer != null) {
            System.out.println("Компьютер найден:");
            System.out.println("Бренд: " + foundComputer.getBrand());
            System.out.println("Модель: " + foundComputer.getModel());
        } else {
            System.out.println("Компьютер не найден");
        }

        System.out.print("Введите бренд компьютера для удаления: ");
        String searchBrandRemove = scanner.next();

        System.out.print("Введите модель компьютера для удаления: ");
        String searchModelRemove = scanner.next();
        Computer foundComputerRemove = shop.findComputer(searchBrandRemove, searchModelRemove);
        if (foundComputer != null) {
            System.out.println("Компьютер найден:");
            System.out.println("Бренд: " + foundComputerRemove.getBrand());
            System.out.println("Модель: " + foundComputerRemove.getModel());
            shop.removeComputer(foundComputerRemove);
        } else {
            System.out.println("Компьютер не найден");
        }

        scanner.close();
    }
}
