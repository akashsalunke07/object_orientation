package capstoneProjects;

import Challenges.ArrayListSortingDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitBowl {

    public void printBySize(ArrayList<Fruit> fruits){
        Sagregator f = new Sagregator();
        ArrayList<ArrayList<Fruit>> sortedF = f.segregateBySize(fruits);

        for (int i=0;i<sortedF.size();i++) {
            if (i == 0) {
                System.out.println("\nFruits In First Layer are : ");
                System.out.println("_______________________________________________");
                sortedF.get(i).forEach(j -> System.out.println(j));
            } else if (i == 1) {
                System.out.println("\nFruits In Second Layer are : ");
                System.out.println("_______________________________________________");
                sortedF.get(i).forEach(j -> System.out.println(j));
            } else if (i == 2) {
                System.out.println("\nFruits In Third Layer are : ");
                System.out.println("_______________________________________________");
                sortedF.get(i).forEach(j -> System.out.println(j));
            }
        }
        if (!sortedF.get(3).isEmpty()){
            System.out.println("\n\n_______________________________________________");
            System.out.println("Fruits Which are Not added in bowl are :");
            System.out.println("_______________________________________________");

            sortedF.get(3).forEach(i-> System.out.println(i));
        }
    }



    public void printByColor(ArrayList<Fruit> fruits){
        Sagregator f = new Sagregator();
        ArrayList<ArrayList<Fruit>> sortedF = f.segregateByColor(fruits);

        for (int i=0;i<sortedF.size();i++) {
            if (i == 0) {
                System.out.println("\nFruits In First Layer are : ");
                System.out.println("\n_______________________________________________");
                sortedF.get(i).forEach(j -> System.out.println(j));
            } else if (i == 1) {
                System.out.println("\nFruits In Second Layer are : ");
                System.out.println("\n_______________________________________________");
                sortedF.get(i).forEach(j -> System.out.println(j));
            } else if (i == 2) {
                System.out.println("\nFruits In Third Layer are : ");
                System.out.println("\n_______________________________________________");
                sortedF.get(i).forEach(j -> System.out.println(j));
            }
        }
        if (!sortedF.get(3).isEmpty()){
            System.out.println("\n_______________________________________________");

            System.out.println("\n\nFruits Which are Not added in bowl are :");
            sortedF.get(3).forEach(i-> System.out.println(i));
        }
    }





    public void printByType(ArrayList<Fruit> fruits){
        Sagregator f = new Sagregator();
        ArrayList<ArrayList<Fruit>> sortedF = f.segregateByType(fruits);

        for (int i=0;i<sortedF.size();i++) {
            if (i == 0) {
                System.out.println("\nFruits In First Layer are : ");
                System.out.println("\n_______________________________________________");
                sortedF.get(i).forEach(j -> System.out.println(j));
            } else if (i == 1) {
                System.out.println("\nFruits In Second Layer are : ");
                System.out.println("\n_______________________________________________");
                sortedF.get(i).forEach(j -> System.out.println(j));
            } else if (i == 2) {
                System.out.println("\nFruits In Third Layer are : ");
                System.out.println("\n_______________________________________________");
                sortedF.get(i).forEach(j -> System.out.println(j));
            }
        }
        if (!sortedF.get(3).isEmpty()){
            System.out.println("\n_______________________________________________");

            System.out.println("\n\nFruits Which are Not added in bowl are :");
            sortedF.get(3).forEach(i-> System.out.println(i));
        }
    }



}


