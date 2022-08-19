package capstoneProjects.shoppingcartchallenge;

import java.util.ArrayList;

public class Item {
     private String name;
     private Double cost;
     private Integer quantity;
     private Double initialCost;


     ArrayList<Item> cart = new ArrayList<>();



     public Item(String name, Integer quantity) {

          this.name = name;
          this.quantity=quantity;
          if (name.equalsIgnoreCase("apple")) {
               this.initialCost = Double.valueOf(30);
               this.cost = Double.valueOf(initialCost * quantity);
          }
          else if (name.equalsIgnoreCase("Milk")) {
               this.initialCost = Double.valueOf(62);
               this.cost = Double.valueOf(initialCost * quantity);
          }
          else if(name.equalsIgnoreCase("newspaper")) {
               this.initialCost = Double.valueOf(7);
               this.cost = Double.valueOf(initialCost * quantity);
          }
     }

     public Item() {

     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Double getCost() {
          return cost;
     }

     public void setCost(Double cost) {
          this.cost = cost;
     }

     public Integer getQuantity() {
          return quantity;
     }

     public void setQuantity(Integer quantity) {
          this.quantity = quantity;
     }

     public double getInitialCost() {
          return initialCost;
     }

     public void setInitialCost(String item,Integer initialCost) {
          if (item.equalsIgnoreCase("apple")) {
               this.initialCost = Double.valueOf(initialCost);
          }
          else if (item.equalsIgnoreCase("Milk")) {
               this.initialCost = Double.valueOf(initialCost);
          }
          else if(item.equalsIgnoreCase("newspaper")) {
               this.initialCost = Double.valueOf(initialCost);
          }
     }

     public ArrayList<Item> getCart() {
          return cart;
     }

     public void setCart(ArrayList<Item> cart) {
          this.cart = cart;
     }

     @Override
     public String toString() {
          return "[" +  name + ","+ cost + ", " + quantity +
                  "]";
     }
}
