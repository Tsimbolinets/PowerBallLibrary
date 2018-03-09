package TicketLibrary;

import java.util.HashMap;
import java.util.List;

public interface IPowerBallChecker {

    HashMap<Ticket.possiblePrize, List<Ticket>> CheckForWinners(List<Ticket> tickets, Ticket ticketWinNumber);

}
