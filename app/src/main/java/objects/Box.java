package objects;

import java.util.ArrayList;

public class Box {
    double height;
    double width;
    double length;
    String color;
    double volume;

    public Box(double height, double width, double length, String color) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.color = color;
        volume =  this.height * this.width *this.length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }

    public static void main(String[] args) {
        Box b1 = new Box(40,44.3,45,"brown");
        Box b2 = new Box(35,40.3,50,"white");
        Box b3 = new Box(30,42.3,37,"black");
        ArrayList<Box> arr = new ArrayList<>();
        arr.add(b1);
        arr.add(b2);
        arr.add(b3);

        for (Box b: arr) {
            System.out.println("\n\n\nBox Heigth is : "+b.height+"\nBox Width is : "+b.width+"\nBox length is : "+b.length+"\n\nVolume Of the BOX is : "+b.getVolume());
        }

    }
}
