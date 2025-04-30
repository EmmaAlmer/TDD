package se.emma.lektioner.bank;

public class ATM {
    Bank bank;

    public ATM(Bank bank)
    {
        this.bank = bank;
    }

    public boolean withdraw(User user, ECurrencies currencyType, double amount) {
        Account a = bank.getUsersAccount(user);
        if(a != null && a.getCurrency().withdraw(currencyType, amount)) {
            user.getCurrency().deposit(currencyType, amount);
            return true;
        }

        return false;
    }

    public boolean deposit(User user, ECurrencies currencyType, double amount) {
        Account a = bank.getUsersAccount(user);
        if(a != null && user.getCurrency().withdraw(currencyType, amount)){
            a.getCurrency().deposit(currencyType, amount);
            return true;
        }
        return false;
    }
}
