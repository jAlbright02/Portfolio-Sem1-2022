package ie.atu;

public class App {
    public static void main(String[] args) {
        Person dave = new Person("Dave", "Ireland", "0891234567");
        System.out.println(dave.toString());
        Customer buyer1 = new Customer("User1", "Galway", "0891234567", "22", false);
        System.out.println(buyer1.toString());
    }
}
