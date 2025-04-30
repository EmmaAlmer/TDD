package se.emma.lektioner.bank;

public class User {
    ECurrencies currency;
    Bank bank;

    String name;
    String id;


    public User(ECurrencies currency, Bank bank, String name, String id, double balance) {
        this.currency = currency;
        this.bank = bank;
        this.name = name;
        this.id = id;
    }


}
