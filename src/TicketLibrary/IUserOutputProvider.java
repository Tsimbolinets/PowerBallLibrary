package TicketLibrary;

import java.util.HashMap;
import java.util.List;

public interface IUserOutputProvider {


    void printWinners(HashMap<Ticket.possiblePrize, List<Ticket>> winners);

    void printTicket(Ticket ticket);
}

