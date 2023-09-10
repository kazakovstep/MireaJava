package lab3;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        double productPrice;
        String currency;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the product: ");
        productPrice = scanner.nextDouble();

        System.out.print("Enter the currency (USD, EUR, GBP): ");
        currency = scanner.next();

        Converter currencyConverter;

        switch (currency.toUpperCase()) {
            case "USD":
                currencyConverter = new Converter(1.0);
                break;
            case "EUR":
                currencyConverter = new Converter(0.85);
                break;
            case "GBP":
                currencyConverter = new Converter(0.72);
                break;
            default:
                System.out.println("Invalid currency. Using USD as default.");
                currencyConverter = new Converter(1.0);
        }

        double totalPrice = currencyConverter.convert(productPrice);
        System.out.printf("Total price in %s: %.2f", currency, totalPrice);

        scanner.close();
    }
}
