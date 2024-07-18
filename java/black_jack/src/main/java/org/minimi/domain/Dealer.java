package org.minimi.domain;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements BlackJackPlayable{

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

  @Override
  public void initCard(Deck deck) {
    getCard(deck);
    getCard(deck);
  }

  @Override
  public void getCard(Deck deck) {
    cardList.add(deck.getCard());
  }

  @Override
  public void showCard() {
    StringBuilder sb = new StringBuilder();

    sb.append(" >>>>> DEALER <<<<< \n");
    for (Card card : cardList) {
      sb.append(card.value() + "(" + card.pattern() + ", " + card.color() + ")\n");
    }
    System.out.println(sb);
  }

  @Override
  public int getCardSum() {
    // TODO test
    return cardList.stream().mapToInt(Card::value).sum();
  }
}
