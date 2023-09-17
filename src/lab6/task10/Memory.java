package lab6.task10;

public class Memory {
    private int size;
    private String type;

    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Память{" +
                "размер = " + size +
                ", тип = " + type + '\'' +
                '}';
    }
}
