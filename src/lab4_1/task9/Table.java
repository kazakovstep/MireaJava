package lab4_1.task9;

class Table extends Furniture {
    private int size;

    public Table(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void getInfo() {
        System.out.println("Стол: " + getName() + ", Цена: $" + getPrice() + ", Размер: " + size + "x" + size);
    }
}
