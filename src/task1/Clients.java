package task1;

public class Clients {
    String name;
    String numberPassport;
    String address;

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

