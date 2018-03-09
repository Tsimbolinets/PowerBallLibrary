package TicketLibrary;

import java.util.HashMap;
import java.util.List;

public interface IPowerBallChecker {

    HashMap<Ticket.possiblePrize, List<Ticket>> checkForWinners(List<Ticket> tickets, Ticket ticketWinNumber);

}
