package ie.atu;

public class App {
    public static void main(String[] args) {
        Customer Part1 = new Customer("Mark", "Claregalway", "0891234567", "42A", true);
        System.out.println(Part1.toString());

        Customer Part2 = new Customer();

        Part2.setNamePerson("James");
        Part2.setAddressPerson("Galway");
        Part2.setPhonePerson("0831234567");
        Part2.setCustomerNumber("55As");
        Part2.setMailingList(true);

        System.out.println(Part2.getNamePerson());
        System.out.println(Part2.getAddressPerson());
        System.out.println(Part2.getPhonePerson());
        System.out.println(Part2.getCustomerNumber());
        System.out.println(Part2.getMailingList());


    }
}
