package objects;

public class Pencile {
    String brand;
    String color;
    double height;
    boolean eraseAttached;

    public Pencile(String brand, String color, double height, boolean eraseAttached) {
        this.brand = brand;
        this.color = color;
        this.height = height;
        this.eraseAttached = eraseAttached;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public boolean isEraseAttached() {
        return eraseAttached;
    }

    public static void main(String[] args) {
        Pencile p1 = new Pencile("Apsara", "Gray", 15.3,true);
        Pencile p2 = new Pencile("Camline", "black", 14.6,false);
        System.out.println("Pencile Attributes are");
        System.out.println("Brand :"+p1.getBrand()+"\nColor is : "+p1.getColor()+"\nHeight is : "+p1.getHeight()+"\nPencile with Eraser :"+p1.isEraseAttached());
        System.out.println("\n\nBrand "+p2.getBrand()+"\nColor is : "+p2.getColor()+"\nHeight is : "+p2.getHeight()+"\nPencile with Eraser :"+p2.isEraseAttached());
    }

}
