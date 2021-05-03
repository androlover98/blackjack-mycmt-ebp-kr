package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testIsNewPlayerBalance0() {
        Player player = new Player();

        assertThat(player.balance()).isEqualTo(0);
    }

    @Test
    public void testPlayerDeposits14BalanceIs14() {
        Player player = new Player();

        player.playerDeposits(14);

        assertThat(player.balance()).isEqualTo(14);
    }

    @Test
    public void testPlayerBalance28Bets11IsBalance17() {
        Player player = new Player();
        player.playerDeposits(28);

        player.playerBets(11);

        assertThat(player.balance()).isEqualTo(28 - 11);
    }

    @Test
    public void testPlayerBalance39Bets12WinsIsBalance51() {
        Player player = new Player();
        player.playerDeposits(39);

        player.playerBets(12);
        player.playerWins();

        assertThat(player.balance()).isEqualTo(39 + 12);
    }

    @Test
    public void testPlayerBalance19Bets3LosesIsBalance16() {
        Player player = new Player();
        player.playerDeposits(19);

        player.playerBets(3);
        player.playerLoses();

        assertThat(player.balance()).isEqualTo(19 - 3);
    }

    @Test
    public void testPlayerBalance27Bets4TiesIsBalance27() {
        Player player = new Player();
        player.playerDeposits(27);

        player.playerBets(4);
        player.playerTies();

        assertThat(player.balance()).isEqualTo(27);
    }

    @Test
    public void testNewPlayerTotalBet0() {
        Player player = new Player();

        assertThat(player.totalAmountBet()).isEqualTo(0);
    }

    @Test
    public void testPlayerBet12TotalBet12() {
        Player player = new Player();
        player.playerDeposits(70);

        player.playerBets(12);

        assertThat(player.totalAmountBet()).isEqualTo(12);
    }

    @Test
    public void testPlayerBet5Bet9Bet23TotalBet37() {
        Player player = new Player();
        player.playerDeposits(70);

        player.playerBets(5);
        player.playerBets(9);
        player.playerBets(23);

        assertThat(player.totalAmountBet()).isEqualTo(5 + 9 + 23);
    }

    @Test
    public void testPlayerBalance112Bet103WinsBalance225() {
        Player player = new Player();
        player.playerDeposits(112);

        player.playerBets(103);
        player.playerWins();

        assertThat(player.balance()).isEqualTo(112 + 103 + 10);
    }

    @Test
    public void testPlayerBalance154Bet103WinsBet164WinsBalance441() {
        Player player = new Player();
        player.playerDeposits(154);

        player.playerBets(103);
        player.playerWins();
        player.playerBets(164);
        player.playerWins();

        assertThat(player.balance()).isEqualTo(154 + 103 + 10 + 164 + 10);
    }
}
