package org.minimi.manager;

import org.minimi.domain.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BlackJackGameManager {
  private final Deck deck = new Deck();
  private final List<Player> players = new ArrayList<>();

  public void startGame() {
    initGame();
    processGame();
  }

  private void initGame() {
    // initiate card deck
    deck.initCardList();
    deck.shuffleCardList();

    // setting players
    this.setPlayers();
  }

  private void setPlayers() {
    // player
    players.add(new Player("USER", false));

    // cpu player
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("몇 명의 사용자를 추가하시겠습니까? (최대 4명)");
    try {
      int s = Integer.parseInt(reader.readLine());

      for (int i = 0; i < s; i++) {
        players.add(new Player("CPU " + (i + 1), true));
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private void processGame() {
    // 모든 플레이어가 스탠드를 하면 딜러턴.

    // Delaer와 Player를 따로따로 처리해야하는지.
    Dealer dealer = new Dealer();
    dealer.initCard(deck);

    players.forEach(player -> {
      player.initCard(deck);
    });

    this.showPlayerCard(dealer);

    // 오버플로우도 확인해야함.
    if (dealer.isBlackJack()) {
      System.out.print("DELAER 우승");
      return;
    }

    players.forEach(this::showPlayerCard);
  }

  private void choose(BlackJackPlayable blackJackPlayer) {
    boolean continuable = !blackJackPlayer.isBlackJack();
    while(continuable) {
      // 더블다운/스플릿/스탠드/히트
    }
  }

  private void showPlayerCard(CardGamePlayer gamePlayer) {
    StringBuilder sb = new StringBuilder();

    sb.append(" >>>>> " + gamePlayer.getName() + " <<<<< \n");
    for (Card card : gamePlayer.getCardList()) {
      sb.append(card.value() + "(" + card.pattern() + ", " + card.color() + ")\n");
    }
    System.out.println(sb);
  }
}
