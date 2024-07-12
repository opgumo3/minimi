package org.minimi.domain;

import org.minimi.constant.CardType;

public record Card(String color, int value, String pattern) {

	public Card(CardType cardType, int value) {
		this(cardType.name(), value, cardType.getSymbol());
	}

	@Override
	public String toString() {
		return "Card {" +
			"color='" + color + '\'' +
			", value=" + value +
			", pattern='" + pattern + '\'' +
			'}';
	}
}
