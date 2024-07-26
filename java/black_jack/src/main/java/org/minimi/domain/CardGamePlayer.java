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

    public void getCard(Deck deck) {
        System.out.printf("%s : 카드를 뽑습니다. \n", name);
        cardList.add(deck.getCard());
    }
}
