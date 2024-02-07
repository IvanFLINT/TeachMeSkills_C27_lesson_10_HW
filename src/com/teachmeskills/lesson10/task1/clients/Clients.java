package com.teachmeskills.lesson10.task1.clients;

/**
 * the "Clients" class contains client description fields. And an overridden "toString" method.
 */
public class Clients {
    final String name;
    final String numberPassport;
    final String address;

    public Clients(String name, String numberPassport, String address) {
        this.name = name;
        this.numberPassport = numberPassport;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Клиент " + name +
                ", № паспорта: " + numberPassport +
                ", Адрес: " + address;
    }
}

