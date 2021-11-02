package by.academy.homework.homework2;

import java.util.Arrays;

public class Task4 {

    public static class CardDeck {
        int quantityCards;
        String[] cards = new String[quantityCards];

        public CardDeck() {

        }

        public CardDeck(int quantityCards) {
//            if (quantityCards!=36 && quantityCards!=52){
//                System.out.println("Invalid quantityCards");
//                return;
//            }
            this.quantityCards = quantityCards;
//            String[] cards = {"6 пик", "7 пик"};
//            this.cards = cards;
        }

    }

    public static void CardSet() {
//        return;
    }

    public static void main(String[] args) {
        CardDeck cardDeck1 = new CardDeck(2);
        CardDeck cardDeck2 = new CardDeck(2);
        System.out.println(cardDeck1.cards==cardDeck2.cards);
        System.out.println(cardDeck1.cards.equals(cardDeck2.cards));

    }
}
