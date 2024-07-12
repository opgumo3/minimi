package org.minimi.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CardType {
	DIAMOND(Color.RED, "◇"),
	SPADE(Color.BLACK, "♠"),
	HEART(Color.RED, "♡"),
	CLUB(Color.BLACK, "♣");

	private final Color color;
	private final String symbol;

	@Getter
	@RequiredArgsConstructor
	enum Color {
		RED("red"),
		BLACK("black");

		private final String name;
	}
}
