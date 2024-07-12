package org.minimi.manager;

import org.minimi.domain.Deck;

public class BlackJackGameManager {
	private final Deck deck = new Deck();

	public void startGame() {
		initGame();
		processGame();
	}

	private void initGame() {
		deck.initCardList();
	}

	private void processGame() {
		boolean isEnd = false;

		if (isEnd) {
			// restart
			startGame();
		}
	}
}
