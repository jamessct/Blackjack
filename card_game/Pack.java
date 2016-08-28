package card_game;
import java.util.ArrayList;

public abstract class Pack {

  protected ArrayList<Card> pack = new ArrayList<Card>();

  public int countCards() {
    return pack.size();
  }
}