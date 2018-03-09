package TicketLibrary;

import java.util.List;

public class Ticket {

    public List<Integer> gameFilledBalls;

    public enum possiblePrize {Four, Seven, Hundred, FiftyThouth, Million, Jackpot}

    public Ticket(List<Integer> gameFilledBalls) {
        this.gameFilledBalls = gameFilledBalls;
    }

    public Ticket() {

    }

    public List<Integer> getGameFilledBalls() {
        return gameFilledBalls;
    }

    public void setGameFilledBalls(List<Integer> gameFilledBalls) {
        this.gameFilledBalls = gameFilledBalls;
    }
}
