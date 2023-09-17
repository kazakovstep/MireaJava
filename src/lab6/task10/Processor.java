package lab6.task10;

public class Processor {
    private String name;
    private double power;
    private String produttore;

    public Processor(String name, double power, String produttore) {
        this.name = name;
        this.power = power;
        this.produttore = produttore;
    }

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    public String getProduttore() {
        return produttore;
    }

    @Override
    public String toString() {
        return "Процессор{" +
                "название ='" + name + '\'' +
                ", можность =" + power +
                ", производитель ='" + produttore + '\'' +
                '}';
    }
}
