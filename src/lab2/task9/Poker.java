package lab2.task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        // Получаем число игроков от пользователя
        System.out.println("Введите количество игроков: ");
        Scanner scanner = new Scanner(System.in);
        int numPlayers = scanner.nextInt();

        // Создаем и перетасовываем колоду карт
        ArrayList<String> deck = createDeck();
        shuffleDeck(deck);

        // Раздаем карты каждому игроку
        dealCards(deck, numPlayers);
    }

    public static ArrayList<String> createDeck() {
        // Создаем колоду карт
        ArrayList<String> deck = new ArrayList<>();
        String[] suits = {"Пики", "Крести", "Бубны", "Черви"};
        String[] ranks = {"6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }

    public static void shuffleDeck(ArrayList<String> deck) {
        // Перетасовываем колоду карт
        Collections.shuffle(deck);
    }

    public static void dealCards(ArrayList<String> deck, int numPlayers) {
        // Раздаем карты каждому игроку
        int numCards = 5;

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < numCards; j++) {
                String card = deck.remove(0);
                System.out.println(card);
            }
            System.out.println();
        }
    }
}