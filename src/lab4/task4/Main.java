package lab4.task4;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("M1", 8);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("iMac", 27, "1920*1080");

        Computer computer = new Computer(ComputerBrand.Apple, processor, memory, monitor);

        System.out.println(computer);
    }
}
