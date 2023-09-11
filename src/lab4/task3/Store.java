package lab4.task3;

import java.util.*;

public class Store {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> products;
    private static Cart cart;

    public static void main(String[] args) {
        // Создание списка товаров
        products = new ArrayList<>();
        products.add(new Product("iPhone", 999.99, Category.ELECTRONICS));
        products.add(new Product("T-shirt", 19.99, Category.CLOTHING));
        products.add(new Product("Book Set", 49.99, Category.BOOKS));
        products.add(new Product("Pomada", 9.99, Category.BEAUTY));
        products.add(new Product("Snickers", 149.99, Category.SPORTS));

        // Создание корзины
        cart = new Cart();

        // Аутентификация пользователя
        authenticateUser();

        boolean running = true;

        while (running) {
            displayMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayCategories();
                    break;
                case 2:
                    displayProductsByCategory();
                    break;
                case 3:
                    addProductToCart();
                    break;
                case 4:
                    displayCart();
                    break;
                case 5:
                    checkout();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный пункт меню.");
                    break;
            }

            System.out.println();
        }

        System.out.println("Выход из приложения.");
    }

    private static void authenticateUser() {
        boolean isAuthenticated = false;
        String username = "";
        String password = "";

        while (!isAuthenticated) {
            System.out.print("Введите логин: ");
            username = scanner.nextLine();
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();

            // Проверка логина и пароля из базы данных
            if (username.equals("admin") && password.equals("admin")) {
                isAuthenticated = true;
            } else {
                System.out.println("Неверный логин или пароль. Попробуйте снова.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Меню:");
        System.out.println("1. Просмотреть список каталогов товаров");
        System.out.println("2. Просмотреть список товаров определенного каталога");
        System.out.println("3. Добавить товар в корзину");
        System.out.println("4. Просмотреть корзину");
        System.out.println("5. Оформить покупку");
        System.out.println("6. Выйти");
        System.out.print("Выберите пункт меню: ");
    }

    private static void displayCategories() {
        System.out.println("Каталоги товаров:");
        for (Category category : Category.values()) {
            System.out.println(category.ordinal() + " - " + category.name());
        }
    }

    private static void displayProductsByCategory() {
        System.out.print("Введите номер каталога: ");
        int categoryIndex = scanner.nextInt();
        scanner.nextLine();

        if (categoryIndex < 0 || categoryIndex >= Category.values().length) {
            System.out.println("Неверный номер каталога.");
            return;
        }

        Category selectedCategory = Category.values()[categoryIndex];
        System.out.println("Товары в категории " + selectedCategory.name() + ":");
        for (Product product : products) {
            if (product.getCategory() == selectedCategory) {
                System.out.println(product.getName() + " - " + product.getPrice());
            }
        }
    }

    private static void addProductToCart() {
        System.out.print("Введите название товара: ");
        String productName = scanner.nextLine();

        // Поиск товара в списке товаров
        Product selectedProduct = null;
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                selectedProduct = product;
                break;
            }
        }

        if (selectedProduct == null) {
            System.out.println("Товар не найден.");
        } else {
            cart.addProduct(selectedProduct);
            System.out.println("Товар" + selectedProduct.getName() + "добавлен в корзину.");
        }
    }

    private static void displayCart() {
        System.out.println("Корзина:");
        for (Product product : cart.getProducts()) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
        System.out.println("Общая сумма: " + cart.getTotalPrice());
    }

    private static void checkout() {
        cart.checkout();
    }
}