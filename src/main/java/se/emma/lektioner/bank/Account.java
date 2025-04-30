package se.emma.lektioner.bank;

public class Account {
    User user;
    Currency currency;

    public Account(User user, Currency currency) {
        this.user = user;
        this.currency = currency;
    }
    public Account(User user)
    {
        this.user = user;
        this.currency = new Currency();
    }

    public Currency getCurrency() {
        return currency;
    }
    public User getUser(){
        return user;
    }

}
