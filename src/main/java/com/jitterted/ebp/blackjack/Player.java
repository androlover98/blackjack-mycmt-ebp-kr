package com.jitterted.ebp.blackjack;

public class Player {
    private int playerBalance = 0;
    private int playerBet = 0;

    public int balance() {
        return playerBalance;
    }

    public void playerDeposits(int amount) {
        this.playerBalance += amount;
    }

    public void playerBets(int betAmount) {
        this.playerBet = betAmount;
        this.playerBalance -= betAmount;
    }

    public void playerWins() {
        this.playerBalance += playerBet * 2;
    }

    public void playerLoses() {
        this.playerBalance += playerBet * 0;
    }

    public void playerTies() {
        this.playerBalance += playerBet * 1;
    }
}
