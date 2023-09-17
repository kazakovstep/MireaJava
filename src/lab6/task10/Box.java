package lab6.task10;

public class Box {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addComputer();
        System.out.println(shop.getList().get(0));
    }
}
