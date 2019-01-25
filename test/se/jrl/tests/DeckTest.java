package se.jrl.tests;
  
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import se.jrl.models.Card;
import se.jrl.models.Deck;

class DeckTest {

		Deck d = new Deck();
		List<Card> testList = d.createDeck();
		Card c = new Card();
		
		@Before
		void setup() {
 		}
	@Test
	void shouldCreateAListThatIsNotNull() {
		List<Card> testList = new ArrayList<Card>();
		testList = d.createDeck();
 		Assert.assertNotNull(testList);
 	}
	
	@Test
	void shouldReturnACard() {
	  Card c = testList.get(0);
	  Assert.assertNotNull(c);
 	}

}
