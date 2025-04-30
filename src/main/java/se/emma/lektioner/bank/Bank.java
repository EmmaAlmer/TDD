package se.emma.lektioner.bank;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();


    public void addAccount(Account account){
        accounts.add(account);
    }

    public Account getUsersAccount(User user){
        for(Account account : accounts){
            if(account.getUser().getID().equals(user.getID()))
            {
                return account;
            }
        }
        return null;
    }

}
