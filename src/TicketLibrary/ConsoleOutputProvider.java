package TicketLibrary;

import java.util.HashMap;
import java.util.List;

public class ConsoleOutputProvider implements IUserOutputProvider {

    public void printWinners(HashMap<Ticket.possiblePrize, List<Ticket>> winners) {
        String str;
        System.out.println();
        str = "4 Dollars won:" + winners.get(Ticket.possiblePrize.Four).size() + " people;" + System.lineSeparator()
                + "7 Dollars won:" + winners.get(Ticket.possiblePrize.Seven).size() + " people;" + System.lineSeparator()
                + "100 Dollars won:" + winners.get(Ticket.possiblePrize.Hundred).size() + " people;" + System.lineSeparator()
                + "50000 Dollars won:" + winners.get(Ticket.possiblePrize.FiftyThouth).size() + " people;" + System.lineSeparator()
                + "1000000 Dollars won:" + winners.get(Ticket.possiblePrize.Million).size() + " people;" + System.lineSeparator()
                + "Jackpot won:" + winners.get(Ticket.possiblePrize.Jackpot).size() + " people;";
        System.out.println(str);
        System.out.println();
    }

    public void printTicket(Ticket ticket) {
        String str = "";
        System.out.println();
        for (int i = 0; i < ticket.getGameFilledBalls().size() - 1; i++) {
            str += "White ball number " + (i + 1) + " = " + ticket.getGameFilledBalls().get(i) + ";" + System.lineSeparator();
        }
        str += "Red ball number  = " + ticket.getGameFilledBalls().get(5);
        System.out.println(str);
    }
}