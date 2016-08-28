package card_game;

public class Card {

  private RankType rank;
  private SuitType suit;

  public Card(RankType rank, SuitType suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public RankType getRank() {
    return rank;
  }

  public SuitType getSuit() {
    return suit;
  }

  public int getValue() {
    return rank.getInt();
  }

  public String getFullCardName() {
    return(enumToString(rank) + " of " + enumToString(suit));
  }

  private String enumToString(Enum input) {
    String name = input.name();
    return name;
  }
}