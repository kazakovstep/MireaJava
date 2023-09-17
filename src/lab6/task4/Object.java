package lab6.task4;

public class Object implements Priceable{
    private double price;
    private String name;

    public Object(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public double getPrice(){
        return price;
    }
}
