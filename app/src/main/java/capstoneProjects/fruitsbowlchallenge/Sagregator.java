package capstoneProjects.fruitsbowlchallenge;

import capstoneProjects.fruitsbowlchallenge.Fruit;

import java.util.ArrayList;

public class Sagregator {

    public ArrayList<ArrayList<Fruit>> segregateByColor(ArrayList<Fruit> fruits){

        ArrayList<Fruit> redFruits = new ArrayList<>();
        ArrayList<Fruit> yellowFruits = new ArrayList<>();
        ArrayList<Fruit> greenFruits = new ArrayList<>();
        ArrayList<Fruit> other = new ArrayList<>();


        fruits.forEach(i -> {
            if(i.getColor().equalsIgnoreCase("red")) {
                redFruits.add(i);
            } else if (i.getColor().equalsIgnoreCase("yellow")) {
                yellowFruits.add(i);
            } else if (i.getColor().equalsIgnoreCase("green")) {
                greenFruits.add(i);
            }
            else{
                other.add(i);
            }
        });

        ArrayList<ArrayList<Fruit>> allFruits = new ArrayList<>();
        allFruits.add(redFruits);
        allFruits.add(yellowFruits);
        allFruits.add(greenFruits);
        allFruits.add(other);

        return allFruits;
    }



    public ArrayList<ArrayList<Fruit>> segregateBySize(ArrayList<Fruit> fruits){

        int sizelimit = fruits.size();

        ArrayList<Fruit> smallFruits = new ArrayList<>(sizelimit);
        ArrayList<Fruit> mediumFruits = new ArrayList<>(sizelimit/2);
        ArrayList<Fruit> largeFruits = new ArrayList<>((sizelimit/4)+1);

        ArrayList<Fruit> canNotAdd = new ArrayList<>();


        int i=0,j=0,k=0;
        for (Fruit fruit : fruits) {

            if(fruit.getSize().equalsIgnoreCase("small")) {
                if (sizelimit>=i) {
                    smallFruits.add(fruit);
                    i++;
                }else {
                    System.out.println("Frist Layer is full Can't add more Fruits " + fruit.getName());
                    canNotAdd.add(fruit);
                }
            } else if (fruit.getSize().equalsIgnoreCase("medium")) {

                if ((sizelimit/2)>j) {
                    mediumFruits.add(fruit);
                    j++;
                }else {
                    System.out.println("Second Layer is full Can't add more Fruits " + fruit.getName());
                    canNotAdd.add(fruit);
                }
            } else if (fruit.getSize().equalsIgnoreCase("large")) {

                if ((sizelimit/4)>k) {
                    largeFruits.add(fruit);
                    k++;
                }else {
                    System.out.println("Third Layer is full Can't add more Fruit " + fruit.getName());
                    canNotAdd.add(fruit);
                }
            }
        }

        ArrayList<ArrayList<Fruit>> allFruits = new ArrayList<>();
        allFruits.add(smallFruits);
        allFruits.add(mediumFruits);
        allFruits.add(largeFruits);
        allFruits.add(canNotAdd);

        return allFruits;
    }

    public ArrayList<ArrayList<Fruit>> segregateByType(ArrayList<Fruit> fruits){

        int sizelimit = fruits.size();

        ArrayList<Fruit> simpleFruits = new ArrayList<>(sizelimit);
        ArrayList<Fruit> aggregateFruits = new ArrayList<>(sizelimit/2);
        ArrayList<Fruit> compositeFruits = new ArrayList<>((sizelimit/4)+1);

        ArrayList<Fruit> canNotAdd = new ArrayList<>();


        int i=0,j=0,k=0;
        for (Fruit fruit : fruits) {

            if(fruit.getType().equalsIgnoreCase("simple")) {
                if (sizelimit>=i) {
                    simpleFruits.add(fruit);
                    i++;
                }else {
                    System.out.println("Frist Layer is full Can't add more Fruits " + fruit.getName());
                    canNotAdd.add(fruit);
                }
            } else if (fruit.getType().equalsIgnoreCase("aggregate")) {

                if ((sizelimit/2)>j) {
                    aggregateFruits.add(fruit);
                    j++;
                }else {
                    System.out.println("Second Layer is full Can't add more Fruits " + fruit.getName());
                    canNotAdd.add(fruit);
                }
            } else if (fruit.getType().equalsIgnoreCase("composite")) {

                if ((sizelimit/4)>k) {
                    compositeFruits.add(fruit);
                    k++;
                }else {
                    System.out.println("Third Layer is full Can't add more Fruit " + fruit.getName());
                    canNotAdd.add(fruit);
                }
            }
        }

        ArrayList<ArrayList<Fruit>> allFruits = new ArrayList<>();
        allFruits.add(simpleFruits);
        allFruits.add(aggregateFruits);
        allFruits.add(compositeFruits);
        allFruits.add(canNotAdd);

        return allFruits;
    }

}
