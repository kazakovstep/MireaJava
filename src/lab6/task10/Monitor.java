package lab6.task10;

public class Monitor {
    private String name;
    private String resolution;
    private String produttore;

    public Monitor(String name, String resolution, String produttore) {
        this.name = name;
        this.resolution = resolution;
        this.produttore = produttore;
    }

    public String getName() {
        return name;
    }

    public String getResolution() {
        return resolution;
    }

    public String getProduttore() {
        return produttore;
    }

    @Override
    public String toString() {
        return "Монитор{" +
                "название ='" + name + '\'' +
                ", разрешение =" + resolution +
                ", производитель ='" + produttore + '\'' +
                '}';
    }
}
