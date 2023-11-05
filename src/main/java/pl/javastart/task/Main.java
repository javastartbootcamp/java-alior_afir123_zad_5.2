package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Address ergo = new Address("Polska", "Gdańsk", "Plac dwóch miast");
        Address wembley = new Address("Anglia", "Londyn", "11th Floor York House");

        Ticket ticket1 = new Ticket("Koncert Muzyki Filmowej", ergo, Ticket.ONLINE, 100, 5, Ticket.ticketId());
        Ticket ticket2 = new Ticket("Koncert Ed Sheeran", wembley, Ticket.STANDARD, 100, 5, 00002);
        Ticket ticket3 = new Ticket("Cirque de Solei", ergo, Ticket.GIFT, 100, 5, 00001);

        //test:
        String bilet1 = ticket1.printInfo();
        String bilet2 = ticket2.printInfo();
        String bilet3 = ticket3.printInfo();

        System.out.println(bilet1);
        System.out.println(bilet2);
        System.out.println(bilet3);

        //Prezentacja pełnych informacji o bilecie:
        String bilet1a = ticket1.printFinalInfo();
        String bilet2a = ticket2.printFinalInfo();
        String bilet3a = ticket3.printFinalInfo();

        System.out.println(bilet1a);
        System.out.println(bilet2a);
        System.out.println(bilet3a);

        Ticket ticket001 = Ticket.generateNewTicket();

        String bilet001 = ticket001.printFinalInfo();
        System.out.println(bilet001);

    }
}
