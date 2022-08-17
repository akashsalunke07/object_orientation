package constructor;

public class HairStyles {
    private String hairStyleName;
    private String color;
    private String forGender;


    public HairStyles(String hairStyleName, String color, String forGender) {
        this.hairStyleName = hairStyleName;
        this.color = color;
        this.forGender = forGender;
    }

    public String getHairStyleName() {
        return hairStyleName;
    }

    public void setHairStyleName(String hairStyleName) {
        this.hairStyleName = hairStyleName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForGender() {
        return forGender;
    }

    public void setForGender(String forGender) {
        this.forGender = forGender;
    }

    @Override
    public String toString() {
        return "HairStyles{" +
                "hairStyleName='" + hairStyleName + '\'' +
                ", color='" + color + '\'' +
                ", forGender='" + forGender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HairStyles h1=new HairStyles("Spikes","black","Men");
        HairStyles h2=new HairStyles("Bob Cut","Brown","Women");

        System.out.println(h1);
        System.out.println(h2);

    }
}
