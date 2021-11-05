package by.academy.homework.homework2;

import java.util.Arrays;

public class Task4 {

    public static class CardDeck {
        static int countCardDeck = 0;
        int quantityCards;
        String[] cards = new String[quantityCards];


        public CardDeck(int quantityCards) {
            if (quantityCards != 36 && quantityCards != 52) {
                System.out.println("Invalid quantityCards");
                return;
            }
            countCardDeck += 1;
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


        //        @Override
//        public String toString() {
//            return "CardDeck " + "cards: "+cards;
//        }
        public void cardSet(int n) {
            if (5*n>this.quantityCards){
                System.out.println("Not enough cards");
                return;
            }
            for (int i = 1; i <= n; i++) {
                StringBuilder player = new StringBuilder();
                player.append("Player "+i+ ": ");

                for (int j = 0; j < 5; j++) {
                    int numCard = (int)(Math.random()*quantityCards+1);
                }

            }

        }

    }

    public static void main(String[] args) {
        int n=0;
        CardDeck cardDeck1 = new CardDeck(36);
//        CardDeck cardDeck2 = new CardDeck(52);
        cardDeck1.cardSet(n);
    }
}
