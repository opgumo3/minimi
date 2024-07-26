package org.minimi.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class CardGamePlayer {
    private final String name;
    private final List<Card> cardList = new ArrayList<>();

    public CardGamePlayer(String name) {
        this.name = name;
    }

    public void initCard(Deck deck) {
        getCard(deck);
        getCard(deck);
    }

    public void getCard(Deck deck) {
        cardList.add(deck.getCard());
    }
}
