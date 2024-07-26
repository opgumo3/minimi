package org.minimi.domain;

public interface BlackJackPlayable {
    int getCardSum();
    void initCard(Deck deck);
    default boolean isBlackJack() {
        return this.getCardSum() == 21;
    };
}
