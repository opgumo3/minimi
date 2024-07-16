package org.minimi.manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.minimi.domain.Dealer;
import org.minimi.domain.Deck;
import org.minimi.domain.Player;

public class BlackJackGameManager {

  private final Deck deck = new Deck();
  private List<Player> players = new ArrayList();

  public void startGame() {
    initGame();
    processGame();
  }

  private void initGame() {
    // initiate card deck
    deck.initCardList();

    // setting players
    this.setPlayer();
    this.setPlayers();
  }

  private void setPlayer() {
    players.add(new Player("USER"));
  }

  private void setPlayers() {
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
    boolean isEnd = false;

    Dealer dealer = Dealer.getInstance();
    dealer.initCard(deck);
    dealer.showCard();

    players.forEach(player -> {
      player.initCard(deck);
      player.showCards();
    });

    if (isEnd) {
      // restart
      startGame();
    }
  }
}
