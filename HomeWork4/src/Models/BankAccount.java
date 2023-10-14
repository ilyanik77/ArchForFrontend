package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    private int balance;
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private long card;


    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public BankAccount() {
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}
