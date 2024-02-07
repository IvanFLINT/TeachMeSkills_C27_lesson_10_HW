package com.teachmeskills.lesson10.task1.clients;

/**
 * the "Clients" class contains client description fields. And an overridden "toString" method.
 */
public class Clients {
    private String name;
    private String numberPassport;
    private String address;

    public Clients(String name, String numberPassport, String address) {
        this.name = name;
        this.numberPassport = numberPassport;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Клиент " + name  +
                ", № паспорта: " + numberPassport +
                ", Адрес: " + address ;
    }
}

