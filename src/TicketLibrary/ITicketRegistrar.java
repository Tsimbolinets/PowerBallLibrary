package TicketLibrary;

import java.util.List;

public interface ITicketRegistrar {

    int maxWhiteBall = 69;
    int maxRedBall = 26;
    int minRedWhiteBall = 1;

    List<Ticket> createTickets(int count);

    Ticket registerTicket();



}
