package lab4.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cart {
    Scanner scanner = new Scanner(System.in);
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void checkout() {
        if (products.isEmpty()) {
            System.out.println("Корзина пуста. Покупка невозможна.");
        } else {
            System.out.println("Сумма покупки: " + getTotalPrice());
            System.out.print("Ваше имя: ");
            String name = scanner.nextLine();
            System.out.println(name + ", спасибо за покупку!");
            products.clear();
        }
    }
}
