package se.emma.lektioner;
import java.util.ArrayList;

public class ItemsCart {

    ArrayList <Items> itemsList = new ArrayList<>();

    // add to cart
    public void addItemsToCart(Items items){

        itemsList.add(items);
    }

    // Prices before discount
    public double totalBeforeDiscount(){

        double itemTotal = 0;

        for (Items items: itemsList){
            itemTotal += items.getPrice() * items.getQuantity();
        }

        return itemTotal;
    }


    // Discount
    public double totalDiscount(double discount){

        return totalBeforeDiscount() * (discount / 100);
    }

    public double totalAfterDiscount(double discount){

        return totalBeforeDiscount() - totalDiscount(discount);
    }

}
