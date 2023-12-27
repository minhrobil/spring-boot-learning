package com.example.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class CardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);

//        Card[] cardArray = new Card[13];
//        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
//        Arrays.fill(cardArray, aceOfHearts);
//        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);
//
//        List<Card> cards = new ArrayList<>(52);
//        Collections.fill(cards, aceOfHearts);
//        System.out.println(cards);
//        System.out.println("cards.size() = " + cards.size());
//
//        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
//        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
//        Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);
//
//        Collections.addAll(cards, cardArray);
//        Collections.addAll(cards, cardArray);
//        Card.printDeck(cards, "Card Collection with Aces added", 2);
//
//        Collections.copy(cards, kingsOfClubs);
//        Card.printDeck(cards, "Card Collection with Kings copied", 2);
//
//        cards = List.copyOf(kingsOfClubs);
//        Card.printDeck(cards, "List Copy of Kings", 1);
//
//        List<Card> deck = Card.getStandardDeck();
//        Collections.shuffle(deck);
//        Card.printDeck(deck, "Suffeled Deck", 4);
//
//        Collections.reverse(deck);
//        Card.printDeck(deck, "Reversed Deck of Cards:", 4);
//
//        var sortingAlgorithm = Comparator.comparing(Card::rank)
//                .thenComparing(Card::suit);
//        Collections.sort(deck, sortingAlgorithm);
//        Card.printDeck(deck, "Standard Deck sorted by rank, suit", 13);
//
//        Collections.reverse(deck);
//        Card.printDeck(deck, "Reversed Deck of Cards:", 4);
//
//        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
//        Card.printDeck(kings, "Kings in deck:", 1);
//
//        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
//        Card.printDeck(tens, "Tens in deck:", 1);
//
//        Collections.shuffle(deck);
//        int subListIndex = Collections.indexOfSubList(deck, tens);
//        System.out.println("Sublist index for tens = " + subListIndex);
//        System.out.println("Contains = " + deck.containsAll(tens));
//
//        boolean disjoint = Collections.disjoint(deck, tens);
//        System.out.println("disjoint = " + disjoint);
//
//        boolean disjoint2 = Collections.disjoint(kings, tens);
//        System.out.println("disjoint2 = " + disjoint2);
//
//        deck.sort(sortingAlgorithm);
//        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
//        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlgorithm);
//        System.out.println("foundIndex = " + foundIndex);
//        System.out.println("foundIndex = " + deck.indexOf(tenOfHearts));
//        System.out.println(deck.get(foundIndex));
//
//        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUB, 10);
//        Collections.replaceAll(deck, tenOfClubs, tenOfHearts);
//        Card.printDeck(deck.subList(32, 36), "Tens row", 1);
//
//        if (Collections.replaceAll(deck, tenOfClubs, tenOfHearts)) {
//            System.out.println("Tens of hearts replaced with tens of clubs");
//        } else {
//            System.out.println("No tens of hearts found in the list");
//        }
//
//        System.out.println("ten of clubs cards = " + Collections.frequency(deck, tenOfClubs));
//        System.out.println("Best Card = " + Collections.max(deck, sortingAlgorithm));
//        System.out.println("Worst Card = " + Collections.min(deck, sortingAlgorithm));
//
//        var sortBySuit = Comparator.comparing(Card::suit).thenComparing(Card::rank);
//        deck.sort(sortBySuit);
//        Card.printDeck(deck, "Sorted by Suit, Rank", 4);
//
//        List<Card> copied = new ArrayList<>(deck.subList(0, 13));
//        Collections.rotate(copied, 2);
//        System.out.println("UnRotated: " + deck.subList(0, 13));
//        System.out.println("Rotated " + 2 + ": " + copied);
//
//        copied = new ArrayList<>(deck.subList(0, 13));
//        Collections.rotate(copied, -2);
//        System.out.println("UnRotated: " + deck.subList(0, 13));
//        System.out.println("Rotated " + -2 + ": " + copied);
//
//        copied = new ArrayList<>(deck.subList(0, 13));
//        for (int i = 0; i < copied.size() / 2; i++) {
//            Collections.swap(copied, i, copied.size() - 1 - i);
//        }
//        System.out.println("Manual reverse: " + copied);
//
//        copied = new ArrayList<>(deck.subList(0, 13));
//        Collections.reverse(copied);

        List<Card> deck = Card.getStandardDeck();
        Card.dealToPlayersHands(deck, 2);

    }
}
