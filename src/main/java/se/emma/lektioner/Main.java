package se.emma.lektioner;

import se.emma.lektioner.l2.Items;
import se.emma.lektioner.l2.ItemsCart;
import se.emma.lektioner.l2.animals.Bird;
import se.emma.lektioner.l2.animals.Dog;
import se.emma.lektioner.l2.animals.IAnimal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //uppgift 1-2
        ItemsCart ic = new ItemsCart();
        ic.addItemsToCart(new Items("phone", 500.00, 2));
        ic.addItemsToCart(new Items("laptop", 1000.00, 1));

        System.out.println(ic.totalDiscount(30));
        System.out.println(ic.totalBeforeDiscount());
        System.out.println(ic.totalAfterDiscount(30));

        //uppgift 4
        Bird bird1 = new Bird();
        Dog dog1 = new Dog();

        ArrayList <Bird> birds = new ArrayList<>();
        birds.add(bird1);
        //det är ju fel datatyp
        //birds.add(dog1);

        ArrayList <IAnimal> animals = new ArrayList<>();
        animals.add(bird1);
        animals.add(dog1);

        //uppgift 4.5
        //jag tycker att den följer dependency inversion eftersom att klassen är av
        //allmän datatyp och går att användas på flera objekt

    }
}
