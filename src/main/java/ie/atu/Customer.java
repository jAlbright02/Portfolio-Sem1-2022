package ie.atu;

public class Customer extends Person{

    private String customerNumber;
    private boolean mailingList;

    public Customer() {
    }

    public Customer(String namePerson, String addressPerson, String phonePerson, String customerNumber, boolean mailingList) {
        super(namePerson, addressPerson, phonePerson);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCustomer Name: " + customerNumber + '\n' + "Mailing List: " + mailingList;


    }
}
