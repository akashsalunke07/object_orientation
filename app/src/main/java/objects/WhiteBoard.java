package objects;

import java.util.ArrayList;

public class WhiteBoard {
    double height;
    double width;
    String color;
    boolean isErasableWithCloth;


    public WhiteBoard(double height, double width, String color, boolean isErasableWithCloth) {
        this.height = height;
        this.width = width;
        this.color = color;
        this.isErasableWithCloth = isErasableWithCloth;
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public boolean isErasableWithCloth() {
        return isErasableWithCloth;
    }


    public static void main(String[] args) {
        WhiteBoard w1 = new WhiteBoard(74.2,150.3, "White", true);
        WhiteBoard w2 = new WhiteBoard(41.2,93.3, "Green", true);
        WhiteBoard w3 = new WhiteBoard(53.2,112.3, "White", false);
        ArrayList<WhiteBoard> arr = new ArrayList<>();
        arr.add(w1);
        arr.add(w2);
        arr.add(w3);

        int i=1;
        for (WhiteBoard w: arr) {
            System.out.println("\n\nProperties of Board "+i+" is given below");
            System.out.println("Height is : "+w.height+"\nWidth is " + w.width+"\nColor is : "+ w.color+"\nIs is Erasable with cloth : "+ w.isErasableWithCloth());
            i++;
        }
    }

}



