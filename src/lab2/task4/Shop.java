package lab2.task4;

import lab2.task4.Computer;

import java.util.ArrayList;
import java.util.List;

class Shop {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен в магазин");
    }

    public void removeComputer(Computer computer) {
        if (computers.remove(computer)) {
            System.out.println("Компьютер удален из магазина");
        } else {
            System.out.println("Компьютер не найден в магазине");
        }
    }

    public Computer findComputer(String brand, String model) {
        for (Computer computer : computers) {
            if (computer.getBrand().equals(brand) && computer.getModel().equals(model)) {
                return computer;
            }
        }
        return null;
    }
}