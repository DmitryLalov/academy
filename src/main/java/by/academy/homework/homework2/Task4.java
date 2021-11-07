package by.academy.homework.homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        deal();
    }

    private static void deal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input quantity players");
        int n = scanner.nextInt();
        int quantityCards = 0;
        if (n <= 7 && n > 0) {
            System.out.println("Input quantity cards");
            quantityCards = scanner.nextInt();
            if (quantityCards != 36 && quantityCards != 52) {
                System.out.println("Invalid quantityCards");
                return;
            }
        } else if (n <= 10 && n > 7) {
            quantityCards = 52;
        } else {
            System.out.println("Invalid value of quantity players");
            return;
        }
        CardDeck cardDeck = new CardDeck(quantityCards);
        cardDeck.cardSet(n);
        scanner.close();
    }

/*
Класс описывает карточную колоду. Содержит в себе 3 метода:
public CardDeck конструктор класса для создания карточной колоды с определенным набором карт,
private void cardSet(int n) для раздачи 5 карт n игрокам,
private int[] shuffleCardDeck(int quantityCards) для перетасовки карт в колоде
 */

    private static class CardDeck {

        private int quantityCards;
        private String[] cards = new String[quantityCards];

        public CardDeck(int quantityCards) {

            this.quantityCards = quantityCards;
            String[] cards;
            if (quantityCards == 36) {
                cards = new String[]{"6 пик", "7 пик", "8 пик", "9 пик", "10 пик", "Валет пик", "Дама пик",
                        "Король пик", "Туз пик", "6 трефа", "7 трефа", "8 трефа", "9 трефа", "10 трефа",
                        "Валет трефа", "Дама трефа", "Король трефа", "Туз трефа", "6 бубна", "7 бубна",
                        "8 бубна", "9 бубна", "10 бубна", "Валет бубна", "Дама бубна", "Король бубна",
                        "Туз бубна", "6 черва", "7 черва", "8 черва", "9 черва", "10 черва", "Валет черва",
                        "Дама черва", "Король черва", "Туз черва"};
            } else {
                cards = new String[]{"2 пик", "3 пик", "4 пик", "5 пик", "6 пик", "7 пик", "8 пик", "9 пик",
                        "10 пик", "Валет пик", "Дама пик", "Король пик", "Туз пик", "2 трефа", "3 трефа",
                        "4 трефа", "5 трефа", "6 трефа", "7 трефа", "8 трефа", "9 трефа", "10 трефа",
                        "Валет трефа", "Дама трефа", "Король трефа", "Туз трефа", "2 бубна", "3 бубна",
                        "4 бубна", "5 бубна", "6 бубна", "7 бубна", "8 бубна", "9 бубна", "10 бубна",
                        "Валет бубна", "Дама бубна", "Король бубна", "Туз бубна", "2 черва", "3 черва",
                        "4 черва", "5 черва", "6 черва", "7 черва", "8 черва", "9 черва", "10 черва",
                        "Валет черва", "Дама черва", "Король черва", "Туз черва"};
            }
            this.cards = cards;
        }

        private void cardSet(int n) {

            if (5 * n > this.quantityCards) {
                System.out.println("Not enough cards");
                return;
            }
            int[] indexOfCardInCardDeck = shuffleCardDeck(quantityCards);

            for (int i = 1; i <= n; i++) {
                StringBuilder player = new StringBuilder();
                player.append("Player " + i + ": ");
                for (int j = 0; j < 5; j++) {
                    player.append(cards[indexOfCardInCardDeck[(i - 1) * 5 + j]] + ", ");
                }
                System.out.println(player.deleteCharAt(player.length() - 2));
                System.out.println();
            }
        }

        private int[] shuffleCardDeck(int quantityCards) {
            int[] indexOfCardInCardDeck = new int[quantityCards];
            for (int i = 0; i < indexOfCardInCardDeck.length; i++) {
                indexOfCardInCardDeck[i] = i;
            }
            int a = 0;
            int b = 0;
            int c = 0;
            Random random = new Random();
            for (int i = 0; i < 50; i++) {
                a = random.nextInt(quantityCards);
                b = random.nextInt(quantityCards);
                c = indexOfCardInCardDeck[b];
                indexOfCardInCardDeck[b] = indexOfCardInCardDeck[a];
                indexOfCardInCardDeck[a] = c;
            }
            return indexOfCardInCardDeck;
        }
    }
}

