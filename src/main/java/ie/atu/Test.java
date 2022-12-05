package ie.atu;

public class Test {

    public static void main(String[] args) {
        Customer Part1 = new Customer("James", "Galway", "0831234567", "45a", true);

        System.out.println(Part1.toString());

        System.out.println(Part1.getName());
        System.out.println(Part1.getAddress());
        System.out.println(Part1.getNumber());
        System.out.println(Part1.getCustomerNum());
        System.out.println(Part1.getMailingList());


    }





}
