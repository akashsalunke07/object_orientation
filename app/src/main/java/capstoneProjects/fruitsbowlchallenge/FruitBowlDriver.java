package capstoneProjects.fruitsbowlchallenge;

import capstoneProjects.fruitsbowlchallenge.Fruit;
import capstoneProjects.fruitsbowlchallenge.FruitBowl;

import java.util.ArrayList;

public class FruitBowlDriver {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Fruits you Want to add");
        int noOfFruits = sc.nextInt();
        ArrayList<Fruit> fruits = new ArrayList<>(noOfFruits);
        for (int i=0;i<noOfFruits;i++){
            System.out.println("Enter Name,color and size(Small/medium/Large) of fruit "+(i+1));
            String name = sc.next();
            String color = sc.next();
            String size = sc.next();
            fruits.add(new Fruit(name,color,size));
        }
        */

        ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
        fruitList.add(new Fruit("Apple", "Light Red","Simple","Medium"));
        fruitList.add(new Fruit("JackFruit", "Dark Yellow","Composite","Large"));
        fruitList.add(new Fruit("Grapes", "Purple","Simple","Small"));
        fruitList.add(new Fruit("Strawberry", "Red","Aggregate","Small"));
        fruitList.add(new Fruit("Watermelon", "Green","Simple","Large"));



        FruitBowl bowl = new FruitBowl();
        bowl.printBySize(fruitList);
    }
}
