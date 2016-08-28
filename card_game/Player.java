package card_game;
import java.util.*;

public abstract class Player {

  public Hand hand = new Hand();

  public Hand hand() {
    return this.hand;
  }

  public int getPlayerScore() {
    return hand.getScore();
  }

  public boolean checkForWinner() {
    if(hand.countCards() == 2 | hand.getScore() == 21){
      return true;
    }
    return false;
  }
}