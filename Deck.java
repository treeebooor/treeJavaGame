package treegame;

import java.util.*;

public class Deck {
	private ArrayList<Card> hand;
	
	public Deck()
	{
		this.hand = new ArrayList<Card>();
	
	}
	public void draw()
	{
		int rand = (int)(Math.random()*5);
		Card card = new Card(rand);
		this.hand.add(card);
	}
	
	public ArrayList<Card> getHand()
	{
		return this.hand;
	}
	
	
}
