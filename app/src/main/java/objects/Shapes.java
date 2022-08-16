package objects;

import java.util.ArrayList;

public class Shapes {
    String name;
    boolean isPolygon;
    int noOfEdges;
    int noOfDimension;

    public Shapes(String name, boolean isPolygon, int noOfEdges, int noOfDimension) {
        this.name = name;
        this.isPolygon = isPolygon;
        this.noOfEdges = noOfEdges;
        this.noOfDimension = noOfDimension;
    }

    public String getName() {
        return name;
    }

    public boolean isPolygon() {
        return isPolygon;
    }

    public int getNoOfEdges() {
        return noOfEdges;
    }

    public int getNoOfDimension() {
        return noOfDimension;
    }

    public static void main(String[] args) {

        Shapes s1 = new Shapes("Square",true,4,2);
        Shapes s2 = new Shapes("Circle",false,0,2);
        Shapes s3 = new Shapes("Hexagon",true,6,2);

        ArrayList<Shapes> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        int i=1;
        for (Shapes s: arr) {
            System.out.println("\n\nProperties of Shape "+i+" is given below");
            System.out.println("Name : "+s.name+"\nIs it a Polygon " + s.isPolygon()+"\nNo of Edges : "+ s.noOfEdges+"\nNo of Dimensions : "+ s.getNoOfDimension());
            i++;
        }


    }
}
