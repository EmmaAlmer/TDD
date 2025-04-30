package se.emma.lektioner.bank;

public class User {
    Currency currency;
    Bank bank;

    String name;
    String id;


    public User(Currency currency, Bank bank, String name, String id) {
        this.currency = currency;
        this.bank = bank;
        this.name = name;
        this.id = id;
    }

    public User(Bank bank, String name, String id) {
        this.currency = new Currency();
        this.bank = bank;
        this.name = name;
        this.id = id;
        this.bank.addAccount(new Account(this));
    }

    public String getID(){
        return id;
    }

    public Currency getCurrency(){
        return currency;
    }


}
