package capstoneProjects.fruitsbowlchallenge;

public class Fruit {
        private String name;
        private String color;
        private String type;
        private String size;


    public Fruit(String name, String color, String type, String size) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.size = size;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
        public String toString() {
            return "[ " + name +", "+  color +", "+   type +", "+   size + " ]";
        }

}
