package TicketLibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public interface IPowerBallStatistic {
     ArrayList<Integer> posiblePrizes = new ArrayList<>(Arrays.asList(4, 7, 100, 50000, 1000000, 150000000));
     HashMap<Ticket.possiblePrize, Double> chanceToWin = new HashMap<>();


    void statisticOfWinning(int ticketsCount, HashMap<Ticket.possiblePrize, List<Ticket>> winners);
}
