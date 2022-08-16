package encapsulation;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rect  = new Rectangle(4.5,7.5);
        System.out.println(rect.getHeight());
        System.out.println(rect.getWidth());
    }
}
