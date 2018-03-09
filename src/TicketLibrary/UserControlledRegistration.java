package TicketLibrary;


import java.util.ArrayList;
import java.util.Scanner;

public abstract class UserControlledRegistration implements ITicketRegistrar {


    public Ticket registerTicketYourself() {
        ArrayList<Integer> registerTicket = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int value;
        boolean checker = true;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Please, input ball number " + (i + 1) + " from range (" + minRedWhiteBall + "," + maxWhiteBall + ")");
                value = sc.nextInt();
                if (value <= maxWhiteBall && value >= minRedWhiteBall && !registerTicket.contains(value)) {
                    checker = false;
                    continue;
                }
                if (!checker) {
                    System.out.println("Wrong number or number is already taken");
                }
                checker = true;
            } while (checker);
            registerTicket.add(value);
        }
        do {
            System.out.println("Please, input ball number " + 6 + " from range (" + minRedWhiteBall + "," + maxRedBall + ")");
            value = sc.nextInt();
            if (value <= maxRedBall && value >= minRedWhiteBall) {
                checker = false;
                continue;
            }
            if (!checker) {
                System.out.println("Wrong number or number is already taken");
            }
            checker = true;
        } while (checker);
        registerTicket.add(value);
        return new Ticket(registerTicket);
    }
}
