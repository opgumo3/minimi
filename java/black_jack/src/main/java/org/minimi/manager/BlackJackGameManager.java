package org.minimi.manager;

import org.minimi.domain.Deck;

public class BlackJackGameManager {
	private final Deck deck = new Deck();

	public void startGame() {
		initGame();
	}

	private void initGame() {
		deck.initCardList();
		deck.logCardList();
	}

	private void processGame() {

	}
}
