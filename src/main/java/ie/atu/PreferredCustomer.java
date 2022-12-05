package ie.atu;

public class PreferredCustomer extends Customer{

    private String purchaseAmount;
    private String lvlDiscount;

    public PreferredCustomer(String name, String address, String number, String customerNum, Boolean mailingList, String purchaseAmount, String lvlDiscount) {
        super(name, address, number, customerNum, mailingList);
        this.purchaseAmount = purchaseAmount;
        this.lvlDiscount = lvlDiscount;
    }

    public String getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(String purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public String getLvlDiscount() {
        return lvlDiscount;
    }

    public void setLvlDiscount(String lvlDiscount) {
        this.lvlDiscount = lvlDiscount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCustomer spent: " + purchaseAmount + "\nDiscount: " + lvlDiscount;

    }

}
