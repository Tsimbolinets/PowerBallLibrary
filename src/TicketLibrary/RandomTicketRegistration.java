package TicketLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTicketRegistration implements ITicketRegistrar {

    private int getRandomWithExclusion(int start, int end, ArrayList<Integer> exclude) {
        Random rand = new Random();
        int range = start - end + 1;
        int random = rand.nextInt(range) + 1;
        while (exclude.contains(random)) {
            random = rand.nextInt(range) + 1;
        }
        return random;
    }

    public List<Ticket> createTickets(int count) {
        List<Ticket> tickets = new ArrayList<>();
        for (int i = 1; i < count; i++) {
            Ticket ticket = registerTicket();
            tickets.add(ticket);
        }
        return tickets;
    }

    public Ticket registerTicket() {
        ArrayList<Integer> exclude = new ArrayList<>();
        ArrayList<Integer> registerTicket = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            int random = getRandomWithExclusion(maxWhiteBall, minRedWhiteBall, exclude);
            registerTicket.add(random);
            exclude.add(random);
        }
        exclude.clear();
        registerTicket.add(getRandomWithExclusion(maxRedBall, minRedWhiteBall, exclude));
        return new Ticket(registerTicket);
    }

}
