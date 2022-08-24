package capstoneProjects.shoppingcartchallenge;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class ShoppingCart {

    Item item;

    EWallet googlePay = new EWallet("Google Pay", 1000.0);

    public ShoppingCart(Item item) {
        this.item = item;
    }


    public void addItem(String name,int quantity){
        ArrayList<Item> tempCart = this.item.getCart();
        Boolean flag = false;

        for (Item i : tempCart) {
            if (i.getName().equalsIgnoreCase(name)) {
                i.setQuantity(i.getQuantity() + quantity);
                i.setCost(i.getCost()+new Item(name,quantity).getCost());
                flag = true;
                break;
            }
        }
        if (!flag)
            this.item.getCart().add(new Item(name, quantity));
    }

    public void removeItem(String name){
        for (Item i : this.item.getCart()) {
            if (i.getName().equalsIgnoreCase(name)) {
               this.item.getCart().remove(i);
               break;
            }
        }
    }

    public void reduceQuantityBy(String name,Integer quantity){
        for (Item i : this.item.getCart()) {
                if (i.getName().equalsIgnoreCase(name)) {
                    if(quantity==i.getQuantity()){
                        item.getCart().remove(i);

                    } else if (quantity <= i.getQuantity()) {
                        i.setQuantity(i.getQuantity() - quantity);
                        i.setCost(i.getCost()-(i.getInitialCost()*quantity));
                    }
                    else {
                        System.err.println("\nNo of items in list are less than no of items want to reduces \n");
                    }
                    break;
                }
        }
    }

    public void displayCart(){
        if (this.item.getCart().isEmpty()){
            System.out.println("\n_____________Cart is Empty________________\n");
        }else {
            System.out.println("\n_____________Items in your cart are________________");
            System.out.println(item.getCart());
        }
    }

    public ArrayList<Item> getCart(){
        return item.getCart();
    }

    public Double totalBill(){
        Double total = 0.0;
        for (Item i : this.item.getCart()) {
            total += i.getCost();
        }
        return total;
    }

    public Double discount(Double bill){
        if(bill>=100){
            return (bill-(bill/100)*5);
        }
        else return bill;
    }

    public void checkOffers(){
        boolean flag = false;
        for (int i=0;i<this.getCart().size();i++) {
            if(this.getCart().get(i).getName().equalsIgnoreCase("Milk")) {
                Integer milkQuantity = this.item.getCart().get(i).getQuantity();
                if (milkQuantity >= 2) {
                    System.out.println("\n\nYou have offer on Milk");
                    System.out.println("You will get " + (milkQuantity / 2) + "pack free on " + milkQuantity + " packets of milk");
                    this.item.getCart().get(i).setQuantity(milkQuantity + (milkQuantity / 2));
                    flag=true;
                    break;
                }
            }
        }
        if (!flag)
            System.out.println("You are not eligible for offers");
    }

    public void makePayment(){
        System.out.println("\n");
        System.out.println("________________________________ BILL _______________________________");

        this.displayCart();
        System.out.println("\nYour Total Bill is "+this.totalBill());
        System.out.println("Your Bill After discount is "+this.discount(this.totalBill()));
        System.out.println("\n\nProcessing You Payment through "+this.googlePay.getName()+"...........\n");
        if(this.googlePay.getBalance()>=this.discount(this.totalBill())){
            Double newBal = this.googlePay.getBalance()-this.discount(this.totalBill());
            this.googlePay.setBalance(newBal);
            System.out.println("\nPayment Successful..Thank you..!!!!\n");
            this.item.getCart().clear();

        }else
        {
            System.err.println("\n\nPayment Failed Due to insufficient Balance......!!!!\n");
        }
    }

}
