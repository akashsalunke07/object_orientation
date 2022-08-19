package capstoneProjects.shoppingcartchallenge;

import java.util.ArrayList;

public class ShoppingCartDriver {
    public static void main(String[] args) {

        Item item = new Item();
        ShoppingCart cart = new ShoppingCart(item);

        cart.addItem("Apple",5);


        cart.displayCart();
        cart.addItem("milk",2);
        cart.displayCart();
        cart.reduceQuantityBy("apple",2);
        cart.displayCart();

       // System.out.println(cart.totalBill());

        cart.checkOffers();
        cart.makePayment();
      //  System.out.println(cart.googlePay.getBalance());
        cart.displayCart();



















    }
}
