package card_game;

import java.util.Scanner;

public class IndividualPlayer extends Player {

  Scanner userInput = new Scanner(System.in);

  public IndividualPlayer() {
    this.hand = super.hand;
  }

}