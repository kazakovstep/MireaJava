package lab4.task4;

public class Processor {
    private String model;
    private int numberOfCores;

    public Processor(String model, int numberOfCores) {
        this.model = model;
        this.numberOfCores = numberOfCores;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    @Override
    public String toString() {
        return "Processor: " + model + "Cores: " + numberOfCores;
    }
}
