package org.minimi.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.minimi.constant.CardType;

import lombok.Getter;

@Getter
public class Deck {
	private final Logger logger = Logger.getAnonymousLogger();
	private final List<Card> cardList = new ArrayList<>();

	public void initCardList() {
		for (CardType cardType : CardType.values()) {
			for(int i = 1 ; i < 13 ; i++) {
				cardList.add(new Card(cardType, i));
			}
		}
	}

	public void logCardList() {
		for (Card card : cardList) {
			logger.log(Level.INFO, card.toString());
		}
	}
}