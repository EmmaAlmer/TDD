package se.emma.lektioner;

public class Main {

    public static void main(String[] args) {

        ItemsCart ic = new ItemsCart();
        ic.addItemsToCart(new Items("phone", 500.00, 2));
        ic.addItemsToCart(new Items("laptop", 1000.00, 1));

        System.out.println(ic.totalDiscount(30));
        System.out.println(ic.totalBeforeDiscount());
        System.out.println(ic.totalAfterDiscount(30));

    }
}
