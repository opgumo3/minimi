package org.minimi.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {

  private List<Card> cardList = new ArrayList<>();

  public void play(boolean isAuto) {

  }

  public void getCard(Deck deck) {
    cardList.add(deck.getCard());
  }
}
