package Challenges;

import java.util.*;

public class FindDuplicateElements {
    public static void main(String args[]) {
        int[] numbers = {1,55,666,43434,11212,11323, 55,22,33,546,64342,232,5432,2444,113,333,666,4533,232};

        // logic


        Set<Integer> st = new HashSet();
        System.out.println("_____Duplicate Members Are____\n");

        for (Integer i : numbers){
            if(!st.add(i)){
                System.out.println(i);
            }
        }




    }
}
