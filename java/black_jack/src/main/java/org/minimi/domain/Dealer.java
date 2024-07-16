package org.minimi.domain;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

  private static Dealer dealer;
  private List<Card> cardList = new ArrayList<>();

  // TODO 싱글톤 수정
  public static Dealer getInstance() {
    if (dealer == null) {
      return new Dealer();
    }
    return dealer;
  }

  private Dealer() {
  }

  public void initCard(Deck deck) {
    getCard(deck);
    getCard(deck);
  }

  public void getCard(Deck deck) {
    cardList.add(deck.getCard());
  }

  public void showCard() {
    for (Card card : cardList) {
      System.out.println(card.toString());
    }
  }
}
