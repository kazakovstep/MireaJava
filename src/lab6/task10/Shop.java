package lab6.task10;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements Comands{
    private ArrayList<Computer> list = new ArrayList<>();


    @Override
    public void removeComputer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размер оперативной памяти: ");
        int memory = scanner.nextInt();
        System.out.println("Тип оперативной памяти: ");
        String type = scanner.nextLine();
        Memory myMemory = new Memory(memory, type);

        System.out.println("Название монитора: ");
        String name = scanner.nextLine();
        System.out.println("Разрешение монитора: ");
        String resolution = scanner.nextLine();
        System.out.println("Производитель монитора: ");
        String produttore = scanner.nextLine();
        Monitor myMonitor = new Monitor(name, resolution, produttore);

        System.out.println("Название процессора: ");
        String nameProc = scanner.nextLine();
        System.out.println("Мощность процессора: ");
        double power = scanner.nextDouble();
        System.out.println("Производитель процессора: ");
        String produttoreProc = scanner.nextLine();
        Processor myProcessor = new Processor(nameProc, power, produttoreProc);

        System.out.println("Марка ПК: ");
        String marka = scanner.nextLine();

        switch (marka){
            case "HP":
                Computer computer = new Computer(
                        myProcessor,
                        myMonitor,
                        myMemory,
                        Titles.HP
                );
                list.remove(list.indexOf(computer));
                System.out.println("Компьютер был удалён");
            case "LENOVO":
                Computer computer2 = new Computer(
                        myProcessor,
                        myMonitor,
                        myMemory,
                        Titles.LENOVO
                );
                list.remove(list.indexOf(computer2));
                System.out.println("Компьютер был удалён");
            case "APPLE":
                Computer computer3 = new Computer(
                        myProcessor,
                        myMonitor,
                        myMemory,
                        Titles.APPLE
                );
                list.remove(list.indexOf(computer3));
                System.out.println("Компьютер был удалён");
            default:
                System.out.println("Неизвестная марка компьютера");
                System.exit(1);
        }
    }

    @Override
    public void addComputer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные копьютера: ");
        System.out.println("Размер оперативной памяти: ");
        int memory = scanner.nextInt();
        System.out.println("Тип оперативной памяти: ");
        String type = scanner.next();
        Memory myMemory = new Memory(memory, type);

        System.out.println("Название монитора: ");
        String name = scanner.next();
        System.out.println("Разрешение монитора: ");
        String resolution = scanner.next();
        System.out.println("Производитель монитора: ");
        String produttore = scanner.next();
        Monitor myMonitor = new Monitor(name, resolution, produttore);

        System.out.println("Название процессора: ");
        String nameProc = scanner.next();
        System.out.println("Мощность процессора: ");
        double power = scanner.nextDouble();
        System.out.println("Производитель процессора: ");
        String produttoreProc = scanner.next();
        Processor myProcessor = new Processor(nameProc, power, produttoreProc);

        System.out.println("Марка ПК: ");
        String marka = scanner.next();

        switch (marka) {
            case "HP" -> {
                Computer computer = new Computer(
                        myProcessor,
                        myMonitor,
                        myMemory,
                        Titles.HP
                );
                list.add(computer);
                System.out.println("Компьютер был добавлен");
            }
            case "LENOVO" -> {
                Computer computer2 = new Computer(
                        myProcessor,
                        myMonitor,
                        myMemory,
                        Titles.LENOVO
                );
                list.add(computer2);
                System.out.println("Компьютер был добавлен");
            }
            case "APPLE" -> {
                Computer computer3 = new Computer(
                        myProcessor,
                        myMonitor,
                        myMemory,
                        Titles.APPLE
                );
                list.add(computer3);
                System.out.println("Компьютер был добавлен");
            }
            default -> {
                System.out.println("Неизвестная марка компьютера");
                System.exit(1);
            }
        }

    }

    @Override
    public void searchComputer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные копьютера: ");
        System.out.println("Размер оперативной памяти: ");
        int memory = scanner.nextInt();
        System.out.println("Тип оперативной памяти: ");
        String type = scanner.nextLine();
        Memory myMemory = new Memory(memory, type);

        System.out.println("Название монитора: ");
        String name = scanner.nextLine();
        System.out.println("Разрешение монитора: ");
        String resolution = scanner.nextLine();
        System.out.println("Производитель монитора: ");
        String produttore = scanner.nextLine();
        Monitor myMonitor = new Monitor(name, resolution, produttore);

        System.out.println("Название процессора: ");
        String nameProc = scanner.nextLine();
        System.out.println("Мощность процессора: ");
        double power = scanner.nextDouble();
        System.out.println("Производитель процессора: ");
        String produttoreProc = scanner.nextLine();
        Processor myProcessor = new Processor(nameProc, power, produttoreProc);

        System.out.println("Марка ПК: ");
        String marka = scanner.nextLine();

        switch (marka){
            case "HP":
                Computer computer = new Computer(
                        myProcessor,
                        myMonitor,
                        myMemory,
                        Titles.HP
                );
                System.out.println(computer);
            case "LENOVO":
                Computer computer2 = new Computer(
                        myProcessor,
                        myMonitor,
                        myMemory,
                        Titles.LENOVO
                );
                System.out.println(computer2);
            case "APPLE":
                Computer computer3 = new Computer(
                        myProcessor,
                        myMonitor,
                        myMemory,
                        Titles.APPLE
                );
                System.out.println(computer3);
            default:
                System.out.println("Неизвестная марка компьютера");
                System.exit(1);
        }
    }

    public ArrayList<Computer> getList() {
        return list;
    }
}
