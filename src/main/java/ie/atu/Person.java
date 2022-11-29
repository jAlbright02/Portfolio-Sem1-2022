package ie.atu;

public class Person {

    private String namePerson;
    private String addressPerson;
    private String phonePerson;

    public Person(){
    }

    public Person(String namePerson, String addressPerson, String phonePerson){
        this.namePerson = namePerson;
        this.addressPerson = addressPerson;
        this.phonePerson = phonePerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public String getAddressPerson() {
        return addressPerson;
    }

    public String getPhonePerson() {
        return phonePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public void setAddressPerson(String addressPerson) {
        this.addressPerson = addressPerson;
    }

    public void setPhonePerson(String phonePerson) {
        this.phonePerson = phonePerson;
    }

    @Override
    public String toString() {
        return "Name: " + namePerson + "\nAddress: "+ addressPerson + "\nPhone: " + phonePerson;
    }
}
