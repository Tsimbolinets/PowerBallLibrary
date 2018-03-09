package TicketLibrary;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PowerBallChecker extends PowerBallStatistic {

    public HashMap<Ticket.possiblePrize, List<Ticket>> CheckForWinners(List<Ticket> tickets, Ticket ticketWinNumber) {
        int whiteBallsCount;
        int redBall;
        HashMap<Ticket.possiblePrize, List<Ticket>> winners = new HashMap<>();
        for (Ticket.possiblePrize prize : Ticket.possiblePrize.values()) {
            winners.put(prize, new ArrayList<Ticket>());
        }
        for (Ticket ticket : tickets) {
            whiteBallsCount = 0;
            redBall = 0;
            for (int j = 0; j < ticket.gameFilledBalls.size() - 1; j++) {
                for (int k = 0; k < ticketWinNumber.gameFilledBalls.size() - 1; k++) {
                    if (ticket.gameFilledBalls.get(j).equals(ticketWinNumber.gameFilledBalls.get(k))) {
                        whiteBallsCount++;
                        break;
                    }
                }
            }
            if (ticket.gameFilledBalls.get(5).equals(ticketWinNumber.gameFilledBalls.get(5))) {
                redBall = 1;
            }
            if (whiteBallsCount + redBall == 3) {
                winners.get(Ticket.possiblePrize.Seven).add(ticket);
                continue;
            }
            if (whiteBallsCount + redBall == 4) {
                winners.get(Ticket.possiblePrize.Hundred).add(ticket);
                continue;
            }
            if (whiteBallsCount == 4 & redBall == 1) {
                winners.get(Ticket.possiblePrize.FiftyThouth).add(ticket);
                continue;
            }
            if (whiteBallsCount == 5 & redBall == 1) {
                winners.get(Ticket.possiblePrize.Jackpot).add(ticket);
                continue;
            }
            if (redBall == 1) {
                winners.get(Ticket.possiblePrize.Four).add(ticket);
                continue;
            }
            if (whiteBallsCount == 5) {
                winners.get(Ticket.possiblePrize.Million).add(ticket);
            }
        }
        return winners;
    }

}

