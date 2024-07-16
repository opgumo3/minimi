package org.minimi.domain;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Player {

  private final String name;
  private boolean isAutoPlay = false;
  private List<Card> cardList = new ArrayList<>();

  public Player(String name, boolean isAutoPlay) {
    this.name = name;
    this.isAutoPlay = isAutoPlay;
  }

  public void play() {

  }

  public void initCard(Deck deck) {
    getCard(deck);
    getCard(deck);
  }

  public void getCard(Deck deck) {
    cardList.add(deck.getCard());
  }

  public void showCards() {
    StringBuilder sb = new StringBuilder();

    sb.append(" >>>>> " + this.name + " <<<<< ");
    for (Card card : cardList) {
      sb.append(card.value() + "(" + card.pattern() + ", " + card.color() + ")\n");
    }
    System.out.println(sb.toString());
  }
}
