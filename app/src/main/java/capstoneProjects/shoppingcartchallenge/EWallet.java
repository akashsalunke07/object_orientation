package capstoneProjects.shoppingcartchallenge;

public class EWallet {
    private  String name;
    private  Double balance;

    public EWallet() {
    }

    public EWallet(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
