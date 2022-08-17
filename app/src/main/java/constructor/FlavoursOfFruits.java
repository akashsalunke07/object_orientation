package constructor;

public class FlavoursOfFruits {
    private String name;
    private String flavour;

    public FlavoursOfFruits(String name, String flavour) {
        this.name = name;
        this.flavour = flavour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "FlavoursOfFruits{" +
                "name='" + name + '\'' +
                ", flavour='" + flavour + '\'' +
                '}';
    }

    public static void main(String[] args) {
        FlavoursOfFruits f1 = new FlavoursOfFruits("Mango","Sweet");
        FlavoursOfFruits f2 = new FlavoursOfFruits("Pink Lady","Tart");

        System.out.println(f1);
        System.out.println(f2);

    }
}
