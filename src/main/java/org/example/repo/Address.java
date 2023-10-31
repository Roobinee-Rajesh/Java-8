package org.example.repo;

public class Address {
    private String block,city,state,country;
    private int pincode;

    public Address(String block, String city, String state, String country, int pincode) {
        this.block = block;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public String getBlock() {
        return block;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getPincode() {
        return pincode;
    }
}
