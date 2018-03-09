package TicketLibrary;

import java.util.HashMap;
import java.util.List;

public class PowerBallManager {


    private ITicketRegistrar registrar;

    private IUserIOProvider ioProvider;

    private IPowerBallStatistic statistic;

    private IPowerBallChecker checker;


    public PowerBallManager(ITicketRegistrar registrar, IUserIOProvider ioProvider,
                            IPowerBallStatistic statistic, IPowerBallChecker checker) {
        this.registrar = registrar;
        this.ioProvider = ioProvider;
        this.statistic = statistic;
        this.checker = checker;
    }


    public List<Ticket> createTickets(int ticketCount) {
       return registrar.createTickets(ticketCount);
    }

    public Ticket registerTicket() {
        return registrar.registerTicket();
    }

    public HashMap<Ticket.possiblePrize, List<Ticket>> checkForWinners(List<Ticket> tickets, Ticket ticketWinNumber) {
        return checker.checkForWinners(tickets , ticketWinNumber);
    }

    public void printWinners(HashMap<Ticket.possiblePrize, List<Ticket>> winners) {
        ioProvider.printWinners(winners);
    }

    public void printTicket(Ticket ticket) {
        ioProvider.printTicket(ticket);
    }

    public  Ticket registerTicketYourself() {
        return registrar.registerTicketYourself();
    }

    public void statisticOfWinning(int ticketsCount, HashMap<Ticket.possiblePrize, List<Ticket>> winners){
        statistic.statisticOfWinning(ticketsCount,winners);
    }

    public void setRegistrar(ITicketRegistrar registrar) {
        this.registrar = registrar;
    }

    public IPowerBallStatistic getStatistic() {
        return statistic;
    }

    public void setStatistic(IPowerBallStatistic statistic) {
        this.statistic = statistic;
    }

    public IPowerBallChecker getChecker() {
        return checker;
    }

    public void setChecker(IPowerBallChecker checker) {
        this.checker = checker;
    }

    public IUserIOProvider getIoProvider() {
        return ioProvider;
    }

    public void setIoProvider(IUserIOProvider ioProvider) {
        this.ioProvider = ioProvider;
    }

    public ITicketRegistrar getRegistrar() {
        return registrar;
    }
}
