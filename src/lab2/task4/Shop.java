package lab2.task4;

import java.util.ArrayList;
import java.util.List;

class Shop {

    static class Computer {
        private String brand;
        private String model;

        public Computer(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }
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