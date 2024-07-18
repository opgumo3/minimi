package org.minimi.domain;

public interface BlackJackPlayable {
    void initCard(Deck deck);
    void getCard(Deck deck);
    void showCard();
    int getCardSum();
}
