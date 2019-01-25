package se.jrl.models;

public class Card {
	private String valueCard;
	private String suitCard;

	public Card(String value, String suit) {
		this.valueCard = value;
		this.suitCard = suit;
	}

	public Card() {
		// for testing purpouse only
		}

	public String getValue() {
		return valueCard;
	}

	public String getSuit() {
		return suitCard;
	}

	@Override
	public String toString() {
		return suitCard + " " + valueCard;
	}
}
