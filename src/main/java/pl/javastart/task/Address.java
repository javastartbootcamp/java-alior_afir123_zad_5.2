package pl.javastart.task;

public class Address {
    String country;
    String city;
    String Street;

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        Street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return Street;
    }
}