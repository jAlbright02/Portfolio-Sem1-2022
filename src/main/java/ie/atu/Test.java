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

        Customer Part2 = new Customer();

        Part2.setName("Jim");
        Part2.setAddress("Mayo");
        Part2.setNumber("0871234567");
        Part2.setCustomerNum("10b");
        Part2.setMailingList(false);

        System.out.println(Part2.getName());
        System.out.println(Part2.getAddress());
        System.out.println(Part2.getNumber());
        System.out.println(Part2.getCustomerNum());
        System.out.println(Part2.getMailingList());

        PreferredCustomer Part3 = new PreferredCustomer(1350);

        Part3.customerDiscount(Part3.getPurchaseAmount());

        System.out.println(Part3.toString());


    }





}
