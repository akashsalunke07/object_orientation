package methods;

public class CheeseRakakat {
    public void takeBowl(){
        System.out.println("Take a empty bowl...");
    }
    public void add(String ingredient){
        System.out.println("Add "+ingredient+" in the bowl.");
    }
    public void mix(){
        System.out.println("Mix it.");
    }
    public void takeSheet(){
        System.out.println("Take a Sheet.");
    }
    public void spreadFilling(){
        System.out.println("Spread filling on sheet.");
    }
    public void role(){
        System.out.println("Role it over to form a log.");
    }
    public void sealEdges(){
        System.out.println("Seal the edges with water.");
    }

    public void addRole(){
        System.out.println("To add Another role Repeat the same steps ");
        CheeseRakakat role = new CheeseRakakat();
        role.spreadFilling();
        role.role();
        role.sealEdges();
    }
    public void heatOil(){
        System.out.println("Heat oil in a pan on medium flame.");
    }
    public void deepFry(String ingredient){
        System.out.println("DeepFry the "+ingredient+ "until it gets golden");
    }
    public void takeOutRolls(){
        System.out.println("Take out all role on a paper sheet.");
    }
    public void serveRollsWith(String dip){
        System.out.println("Your role is ready to eat, Serve it with "+dip);
    }

    public static void main(String[] args) {
        CheeseRakakat roles = new CheeseRakakat();
        roles.takeBowl();
        roles.add("mozzarella cheese");
        roles.add("Oregano");
        roles.add("toasted sesame seeds");
        roles.add("Coriander leaves");
        roles.mix();
        roles.takeSheet();
        roles.spreadFilling();
        roles.role();
        roles.sealEdges();
        roles.addRole();
        roles.heatOil();
        roles.deepFry("Cheese Roles");
        roles.takeOutRolls();
        roles.serveRollsWith("Ketchup");
    }


}
