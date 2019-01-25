package se.jrl.models;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Deck {
 	private String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private String[] suits = { "Hjärter", "Ruter", "Klöver", "Spader" };

	private ArrayList<Card> deckList = new ArrayList<Card>();

	 
//tested
	public List<Card> createDeck() {
		for (int i = 0; i < cards.length; i++) {
			for (int x = 0; x < suits.length; x++) {
				Card card = new Card(cards[i], suits[x]);
				deckList.add(card);
			}

		}
		return deckList;
	}

	public void shuffleDeck() {
		Collections.shuffle(deckList);
	}

	public ArrayList<Card> sortedList() {
		deckList.sort((Card s1, Card s2) -> s1.getSuit().compareTo(s2.getSuit()));
		return deckList;
	}

	//tested
	public String drawACard() {
		try {
			Card c = deckList.get(0);
			deckList.remove(c);
			System.out.println(deckList);
			return c.getSuit() + " " + c.getValue();
		} catch (Exception E) {
			System.out.println("Slut på kort!");
		}
		return "";

	}
}