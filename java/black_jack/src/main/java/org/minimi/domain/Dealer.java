package org.minimi.domain;

public class Dealer extends CardGamePlayer implements BlackJackPlayable {

  public Dealer() {
    super("DEALER");
  }

  @Override
  public void initCard(Deck deck) {
    getCard(deck);
    getCard(deck);
  }

  @Override
  public int getCardSum() {
    return getCardList().stream().mapToInt(Card::value).sum();
  }
}
