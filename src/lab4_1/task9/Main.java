package lab4_1.task9;

public class Main {
    public static void main(String[] args) {
        Furniture chair = new Chair("Стул просто лучший", 1000.0, 4);
        Furniture table = new Table("Письменный стол", 1500.0, 90);
        Furniture sofa = new Sofa("Диван удобный", 8000.0, "ткань");

        Furniture[] stock = {chair, table, sofa};

        FurnitureShop shop = new FurnitureShop(stock);

        shop.showStock();
    }
}
