package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Address ergo = new Address("Polska", "Gdańsk", "Plac dwóch miast");
        Address wembley = new Address("Anglia", "Londyn", "11th Floor York House");

        Ticket ticket1 = new Ticket("Koncert Muzyki Filmowej", ergo, Ticket.ONLINE, 100, 5, Ticket.ticketId());
        Ticket ticket2 = new Ticket("Koncert Ed Sheeran", wembley, Ticket.STANDARD, 100, 5, Ticket.ticketId());
        Ticket ticket3 = new Ticket("Cirque de Solei", ergo, Ticket.GIFT, 100, 5, Ticket.ticketId());

        //test:
        String bilet1 = ticket1.printInfo();
        String bilet2 = ticket2.printInfo();
        String bilet3 = ticket3.printInfo();

        System.out.println(bilet1);
        System.out.println(bilet2);
        System.out.println(bilet3);
        System.out.println();

        //Prezentacja pełnych informacji o bilecie:
        String bilet4 = ticket1.printFinalInfo();
        String bilet5 = ticket2.printFinalInfo();
        String bilet6 = ticket3.printFinalInfo();

        System.out.println(bilet4);
        System.out.println(bilet5);
        System.out.println(bilet6);
        System.out.println();

        Ticket ticketFromInput = Ticket.generateNewTicket();

        System.out.println(ticketFromInput.printFinalInfo());
    }
}
