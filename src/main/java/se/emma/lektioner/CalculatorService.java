package se.emma.lektioner;

public class CalculatorService {

    public double addition(double a, double b){

        double c = Math.round( (a + b)*10.0)/10.0;
        return c;
    }
    public int subtract(int a, int b){

        int c = a - b;
        return c;
    }
    public int multiply(int a, int b){

        int c = a * b;
        return c;
    }
    public int divide(int a, int b){

        if ( b == 0){
            return -1;
        }

        int c = a / b;
        return c;
    }
}
