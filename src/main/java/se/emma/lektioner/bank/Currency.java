package se.emma.lektioner.bank;

public class Currency {
    ECurrencies currency;
    double balance;

    final double DOLLARVALUE = 9.64;
    final double EUROVALUE = 10.95;

    public double convert(ECurrencies from, ECurrencies to, double amount){

        if (from == ECurrencies.DOLLAR){
            amount *= DOLLARVALUE;
        }
        else if (from == ECurrencies.EURO){
            amount *= EUROVALUE;
        }
        if (to == ECurrencies.SEK){
            return amount;
        }
        else if (to == ECurrencies.DOLLAR){
            return amount / DOLLARVALUE;
        }
        return amount / EUROVALUE;
    }
}
