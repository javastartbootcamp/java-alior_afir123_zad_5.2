package pl.javastart.task;

import java.util.Scanner;

public class Ticket {
    private String event;
    private Address address;
    private String type;
    private double price;
    private double discount;
    private static int id = 1;

    static final String ONLINE = "Online";
    static final String STANDARD = "Standard";
    static final String GIFT = "Gift";

    public Ticket(String event, Address address, String type, double price, double discount, int id) {
        this.event = event;
        this.address = address;
        this.type = type;
        this.price = price;
        this.discount = discount;
        Ticket.id = id;
    }
     //nie wiedziałem, czy poniższe printInfo wystarczy aby zrealizować treść zadania "Wyświetlić pełne dane o bilecie",
     // więc stworzyłem dodatkowo metodę printFinalInfo

    public String printInfo() {
        return "Bilet " + getType() + ": cena podstawowa " + getPrice() + "zł, zniżka " + getDiscount() +
                "%, cena finalna wyniesie " + finalPrice() + "zł";
    }

    public String printFinalInfo() {
        return getFinalType() + ": Wydarzenie: " + getEvent() + ", adres: " + address.getCountry()
                + ", " + address.getCity() + ", " + address.getStreet() +
                ", ID biletu: " + ticketId() + ", cena podstawowa " + getPrice() + "zł, zniżka "
                + getDiscount() + "%, cena finalna wyniesie " + finalPrice() + "zł";
    }

    private double finalPrice() {
        double finalPrice;
        switch (type) {
            case ONLINE -> finalPrice = price * finalDiscount(discount);
            case STANDARD -> finalPrice = price * finalDiscount(discount) + 5;
            case GIFT ->
                    finalPrice = (price * finalDiscount(discount) + 5) + (price * finalDiscount(discount)) * 5 / 100;
            default -> finalPrice = Double.parseDouble("Błędny typ biletu");
        }
        return Math.round(finalPrice * 100.0)/100.0;
    }

    static Ticket generateNewTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj typ biletu (Online, Standard, Gift):");
        String type = scanner.nextLine();

        System.out.println("Podaj event:");
        String event = scanner.nextLine();

        System.out.println("Gdzie odbywa się koncert(Kraj, Miasto, Ulica):");
        String country = scanner.nextLine();
        String city = scanner.nextLine();
        String street = scanner.nextLine();

        System.out.println("Podaj cenę:");
        double price = scanner.nextDouble();

        System.out.println("Podaj zniżkę");
        double discount = scanner.nextDouble();

        return new Ticket(event, new Address(country, city, street), type, price, discount, Ticket.ticketId());
    }

    private double finalDiscount(double discount) {
        return 1 - (discount / 100);
    }

    static int ticketId() {
        return id++;
    }

    public String getEvent() {
        return event;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    private String getFinalType() {
        String finalType;
        switch (type) {
            case ONLINE -> finalType = "bilet internetowy";
            case STANDARD -> finalType = "bilet standardowy";
            case GIFT -> finalType = "bilet prezentowy";
            default -> finalType = "błędny typ biletu";
        }
        return finalType;
    }
}
