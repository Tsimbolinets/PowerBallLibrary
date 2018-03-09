package TicketLibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PowerBallStatistic implements IPowerBallStatistic {

    private int i = 0;

    public void statisticOfWinning(int ticketsCount, HashMap<Ticket.possiblePrize, List<Ticket>> winners) {
        List<Double> statisticPeopleWon = new ArrayList<>();
        List<Integer> peopleWon = new ArrayList<>();
        double sumStatisticPeopleWon = 0;
        int sumPeopleWon = 0;


        chanceToWin.put(Ticket.possiblePrize.Four, 0.03718771815); // Chance to get red ball
        // is 1/26 * 64/69 * 63/68 * 62/67 *61/66 * 60/65 + 1/26 * 1/69 * 64/68 * 63/67 *62/66 * 61/65;

        chanceToWin.put(Ticket.possiblePrize.Seven, 0.00315071395); // Chance to get 3 white balls or 2 white and red ball
        // is 3/69 * 2/68 * 1/68 * 65/67 * 64/66 * 25/26 + 2/69 * 1/68 * 1/26 * 64/67 *63/66 * 62/65;

        chanceToWin.put(Ticket.possiblePrize.Hundred, 0.00009637192); // Chance to get 4 white balls or 3 white and red ball
        // is 4/69 * 3/68 *2/68 * 1/67 * 65/66 * 25/26 + 3/69 * 2/68 * 1/67 * 1/26  *64/66 * 63/65;

        chanceToWin.put(Ticket.possiblePrize.FiftyThouth, 0.00000109513); // Chance to get 4 white balls and red ball
        // is 4/69 * 3/68 *2/68 * 1/67 * 65/66 * 1/26;

        chanceToWin.put(Ticket.possiblePrize.Million, 8.55574453e-8); // Chance to get 5 white balls
        // is 5/69 * 4/68 *3/68 * 2/67 * 1/66 * 25/26;

        chanceToWin.put(Ticket.possiblePrize.Jackpot, 3.42229781e-9); // Chance to get 5 white balls and red ball
        // is 5/69 * 4/68 *3/68 * 2/67 * 1/66 * 1/26;

        System.out.println();

        for (Ticket.possiblePrize prize : Ticket.possiblePrize.values()) {
            statisticPeopleWon.add(chanceToWin.get(prize) * ticketsCount * posiblePrizes.get(i));
            peopleWon.add(winners.get(prize).size() * posiblePrizes.get(i));
            i++;
        }
        for (int i = 0; i < statisticPeopleWon.size(); i++) {
            sumStatisticPeopleWon += statisticPeopleWon.get(i);
            sumPeopleWon += peopleWon.get(i);
            System.out.println("People statistic won : " + String.format("%.2f", statisticPeopleWon.get(i)) + " $"
                    + ";    People won : " + peopleWon.get(i) + " $");
        }
        System.out.println();
        System.out.println("People statistic won at all : " + String.format("%.2f", sumStatisticPeopleWon) + " $"
                + ";    People won : " + sumPeopleWon + " $");
    }


}
