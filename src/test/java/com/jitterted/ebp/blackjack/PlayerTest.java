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

        assertThat(player.balance()).isEqualTo(17);
    }

    @Test
    public void testPlayerBalance39Bets12WinsIsBalance51() {
        Player player = new Player();
        player.playerDeposits(39);

        player.playerBets(12);
        player.playerWins();

        assertThat(player.balance()).isEqualTo(51);
    }

    @Test
    public void testPlayerBalance19Bets3LosesIsBalance16() {
        Player player = new Player();
        player.playerDeposits(19);

        player.playerBets(3);
        player.playerLoses();

        assertThat(player.balance()).isEqualTo(16);
    }

    @Test
    public void testPlayerBalance27Bets4TiesIsBalance27() {
        Player player = new Player();
        player.playerDeposits(27);

        player.playerBets(4);
        player.playerLoses();

        assertThat(player.balance()).isEqualTo(27);
    }
}
