package temp;

public class f1 {
    String name;

    public f1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "f1{" +
                "name='" + name + '\'' +
                '}';
    }
}
