package se.jrl.main;

import se.jrl.models.Deck;

public class Main {
public static void main(String[] args) {

	Deck d = new Deck();
	d.createDeck();
//	d.shuffleDeck();
//	d.sortedList();
//	d.drawACard();
	
//	for (int i = 0; i < 52; i ++) {
   
//	}
System.out.println(d.sortedList()); 

}
}
