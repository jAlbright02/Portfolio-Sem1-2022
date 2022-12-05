package ie.atu;

public class Customer extends Person{

    private String customerNum;

    private Boolean mailingList;


    public Customer() {

    }

    public Customer(String name, String address, String number, String customerNum, Boolean mailingList) {
        super(name, address, number);
        this.customerNum = customerNum;
        this.mailingList = mailingList;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public Boolean getMailingList() {
        return mailingList;
    }

    public void setMailingList(Boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCustomer Number: " + customerNum + "\nMailing List: " + mailingList;
    }

}
