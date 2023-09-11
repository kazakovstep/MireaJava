package lab4_1.task9;

class Chair extends Furniture {
    private int legs;

    public Chair(String name, double price, int legs) {
        super(name, price);
        this.legs = legs;
    }

    @Override
    public void getInfo() {
        System.out.println("Стул: " + getName() + ", Цена: $" + getPrice() + ", Количество ножек: " + legs);
    }
}
