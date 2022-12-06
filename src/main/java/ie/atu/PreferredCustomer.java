package ie.atu;

public class PreferredCustomer extends Customer{

    private int purchaseAmount;
    private int lvlDiscount;

    public PreferredCustomer(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public PreferredCustomer(String name, String address, String number, String customerNum, Boolean mailingList, int purchaseAmount, int lvlDiscount) {
        super(name, address, number, customerNum, mailingList);
        this.purchaseAmount = purchaseAmount;
        this.lvlDiscount = lvlDiscount;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public int getLvlDiscount() {
        return lvlDiscount;
    }

    public void setLvlDiscount(int lvlDiscount) {
        this.lvlDiscount = lvlDiscount;
    }

    @Override
    public String toString() {
        return "Customer spent: " + purchaseAmount + "\nDiscount: " + lvlDiscount;

    }

    public void customerDiscount(int purchaseAmount) {

        if ((purchaseAmount >= 500) && (purchaseAmount < 1000)) {
            lvlDiscount=5;
        }
        else if ((purchaseAmount >= 1000) && (purchaseAmount < 1500)) {
            lvlDiscount = 6;
        }

        else if ((purchaseAmount >= 1500) && (purchaseAmount < 2000)) {
            lvlDiscount = 7;
        }
        else if (purchaseAmount >= 2000) {
            lvlDiscount = 10;
        }

    }

}
