package lab4_1.task9;

class FurnitureShop {
    private Furniture[] stock;

    public FurnitureShop(Furniture[] stock) {
        this.stock = stock;
    }

    public void showStock() {
        System.out.println("Товары в наличии:");
        for (Furniture item : stock) {
            item.getInfo();
        }
    }
}
