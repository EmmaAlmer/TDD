package se.emma.lektioner;

import se.emma.lektioner.bank.ATM;
import se.emma.lektioner.bank.Bank;
import se.emma.lektioner.bank.ECurrencies;
import se.emma.lektioner.bank.User;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        User emma = new User(bank, "emma", "1");
        ATM atm = new ATM(bank);
        emma.getCurrency().deposit(ECurrencies.SEK, 10000);
        System.out.println("Emma har: " + emma.getCurrency().getBalance() + " pengar av typen " + emma.getCurrency().getCurrencyType());

        atm.deposit(emma, ECurrencies.SEK, 1000);
        System.out.println("Emma har: " + emma.getCurrency().getBalance() + " pengar av typen " + emma.getCurrency().getCurrencyType());
        System.out.println("Emma har: " + bank.getUsersAccount(emma).getCurrency().getBalance() + " pengar på kontot av typen " + bank.getUsersAccount(emma).getCurrency().getCurrencyType());

        atm.deposit(emma, ECurrencies.EURO, 1000);
        System.out.println("Emma har: " + emma.getCurrency().getBalance() + " pengar av typen " + emma.getCurrency().getCurrencyType());
        System.out.println("Emma har: " + bank.getUsersAccount(emma).getCurrency().getBalance() + " pengar på kontot av typen " + bank.getUsersAccount(emma).getCurrency().getCurrencyType());
    }
}
