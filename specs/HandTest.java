// import static org.junit.Assert.*;
// import org.junit.*;
// import card_game.*;

// public class HandTest {

//   Hand hand;
//   Card card1;
//   Card card2;

//   @Before
//   public void before() {
//     hand = new Hand();
//     card1 = new Card(RankType.SEVEN, SuitType.HEARTS);
//     card2 = new Card(RankType.FOUR, SuitType.DIAMONDS);
//   }

//   @Test
//   public void canGetCard() {
//     hand.dealCard(card1);
//     assertEquals(1, hand.countCards());
//   }

//   @Test public void canReadHand() {
//     hand.dealCard(card1);
//     hand.dealCard(card2);
//     assertEquals("SEVEN of HEARTS. FOUR of DIAMONDS. ", hand.outputCardNames());
//   }
// }