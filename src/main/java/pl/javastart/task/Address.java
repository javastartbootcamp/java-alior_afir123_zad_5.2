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

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }
}
