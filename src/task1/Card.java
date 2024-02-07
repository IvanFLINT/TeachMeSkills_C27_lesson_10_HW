package task1;

import java.util.Objects;

public class Card {
    String nameCard;
    int cvv;
    String numberCard;
    int summa;

    public Card(String nameCard, String numberCard,int cvv , int summa) {
        this.nameCard = nameCard;
        this.cvv = cvv;
        this.numberCard = numberCard;
        this.summa = summa;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }
    @Override
    public String toString() {
        return "Карта: " + nameCard  +
                ", №: " + numberCard  +
                ", CVV = " + cvv +
                ", Сумма на счете = " + summa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        return cvv == card.cvv && Objects.equals(nameCard, card.nameCard) && Objects.equals(numberCard, card.numberCard);
    }


}
