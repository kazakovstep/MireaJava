package lab6.task10;

public class Computer {
    private Processor processor;
    private Monitor monitor;
    private Memory memory;
    private Titles title;

    public Computer(Processor processor, Monitor monitor, Memory memory, Titles title) {
        this.processor = processor;
        this.monitor = monitor;
        this.memory = memory;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", monitor=" + monitor +
                ", memory=" + memory +
                ", title=" + title +
                '}';
    }
}
