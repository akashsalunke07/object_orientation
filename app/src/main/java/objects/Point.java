package objects;

import java.util.ArrayList;

public class Point {
    double diameter;
    double radius ;
    boolean isVisible;
    String color;

    public Point(double diameter,boolean isVisible, String color) {
        this.diameter = diameter;
        this.radius = diameter/2;
        this.isVisible = isVisible;
        this.color = color;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public String getColor() {
        return color;
    }


    public static void main(String[] args) {

        Point p1 = new Point(1.1,true,"black");
        Point p2 = new Point(0.6,false,"gray");
        Point p3 = new Point(0.9,true,"blue");

        ArrayList<Point> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);

        for (Point p: arr) {
            System.out.println("\n\n\nPoint Diameter is : "+p.diameter+"\nPoint Radius is : "+p.radius+"\nColor of point is : "+p.color+"\nIs Point is visible : "+ p.isVisible());
        }
    }
}
