package org.minimi.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.random.RandomGenerator;
import java.util.stream.Collector;

import lombok.Getter;
import org.minimi.constant.CardType;

@Getter
public class Deck {

  private final Logger logger = Logger.getAnonymousLogger();
  private final List<Card> cardList = new ArrayList<>();

  public void initCardList() {
    // TODO Recycle Card List
    for (CardType cardType : CardType.values()) {
      for (int i = 1; i < 13; i++) {
        cardList.add(new Card(cardType, i));
      }
    }
  }

  public void shuffleCardList() {
    Collections.shuffle(cardList);
  }

  public Card getCard() {
    // array copy
    return cardList.removeLast();
  }
}
