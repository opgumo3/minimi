package org.minimi.domain;

public class Player extends CardGamePlayer implements BlackJackPlayable {
  private boolean isStand = false;
  private boolean isAutoPlay = false;

  public Player(String name, boolean isAutoPlay) {
    super(name);
    this.isAutoPlay = isAutoPlay;
  }

  public void play() {

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
