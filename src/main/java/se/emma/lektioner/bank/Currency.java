package se.emma.lektioner.bank;

public class Currency {
    ECurrencies currency;
    double balance;

    final double DOLLARVALUE = 9.64;
    final double EUROVALUE = 10.95;

    public Currency(ECurrencies currency, double balance) {
        this.currency = currency;
        this.balance = balance;
    }
    public Currency(){
        currency = ECurrencies.SEK;
        balance = 0;
    }

    public void deposit(ECurrencies c, double amount){
        convert(c);
        balance += amount;
    }
    public boolean withdraw(ECurrencies c, double amount){
        convert(c);
        balance -= amount;
        if(balance > 0)
        {
            return true;
        }
        balance += amount;
        return false;
    }

    public void convert(ECurrencies to){

        if (currency == ECurrencies.DOLLAR){
            balance *= DOLLARVALUE;
        }
        else if (currency == ECurrencies.EURO){
            balance *= EUROVALUE;
        }
        if (to == ECurrencies.DOLLAR){
            this.balance =  balance / DOLLARVALUE;
        }
        else if (to == ECurrencies.EURO){
            this.balance =  balance / EUROVALUE;
        }
        this.currency = to;
    }

    public double getBalance() {
        return balance;
    }
    public ECurrencies getCurrencyType() {
        return currency;
    }
}
