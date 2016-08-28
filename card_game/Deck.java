package card_game;
import java.util.*;

public class Deck extends Pack {

  private ArrayList<Card> cards;

  public Deck() {
    this.cards = super.pack;
  }

  public int getDeckSize() {
    return cards.size();
  }

  public ArrayList<Card> getDeck() {
    return this.cards;
  }

  // public void createDeck(){
  //   for (int i = 1; i < 14; i++){
  //     Card card = new Card(i, SuitType.DIAMONDS);
  //     cards.add(card);
  //   }

  //   for (int i = 1; i < 14; i++){
  //     Card card = new Card(i, SuitType.HEARTS);
  //     cards.add(card);
  //   }

  //   for (int i = 1; i < 14; i++){
  //     Card card = new Card(i, SuitType.SPADES);
  //     cards.add(card);
  //   }

  //   for (int i = 1; i < 14; i++){
  //     Card card = new Card(i, SuitType.CLUBS);
  //     cards.add(card);
  //   }
  // }

  public void createDeck() {
    for(SuitType suit : SuitType.values()) {
      for(RankType rank : RankType.values()) {
        cards.add(new Card(rank, suit));
      }
    }
  }

  public void shuffleDeck() {
    Collections.shuffle(this.cards);
  }

  public Card dealCard() {
    Card card = cards.remove(0);
    return card;
  }
}
