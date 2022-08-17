package methods;

public class PumpkinSoup {
    public void heatOil(){
        System.out.println("Heat oil in large saucepan on low heat..");
    }
    public void add(String vegi){
        System.out.println("Add "+vegi);
    }
    public void cook(String time){
        System.out.println("Cook for "+time);
    }
    public void stir(String time){
        System.out.println("Stir for "+time);
    }
    public void boil(){
        System.out.println("Boil it.....");
    }
    public void cover(){
        System.out.println("Cover it.....");
    }
    public void simmer(String time){
        System.out.println("Simmer it for "+time);
    }
    public void cool(){
        System.out.println("Leave it for cooling for few minutes");
    }
    public void stirThrough(String ele1,String ele2){
        System.out.println("Stir through "+ele1+" and "+ele2);
    }
    public void seasonAndServe(){
        System.out.println("Seasone it and serve it");
    }
    public void lowHeat(){
        System.out.println("Turn heat low.");
    }
    public void blend(){
        System.out.println("Blend it in batches.");
    }
    public void serve(){
        System.out.println("Your food is ready to serve.....");
    }
    public void season(){
        System.out.println("Add Seasoning on it");
    }

    public static void main(String[] args) {
        PumpkinSoup soup = new PumpkinSoup();
        soup.heatOil();
        soup.add("Onion");
        soup.add("leek");
        soup.cook("2-3 Minutes");
        soup.add("garlic");
        soup.add("spices");
        soup.cook("30 seconds");
        soup.stir("30 seconds");
        soup.add("pumpkin");
        soup.add("potato");
        soup.add("stock");
        soup.boil();
        soup.lowHeat();
        soup.cover();
        soup.simmer("30 minutes");
        soup.cool();
        soup.blend();
        soup.season();
        soup.serve();
    }

}
