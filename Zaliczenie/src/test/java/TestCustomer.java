import Paczka.Customer;




public class TestCustomer {
    public TestCustomer() {
    }

    public static void main(String[] args) {
        Customer customer = new Customer(1234, "Ola", 10);
        System.out.println(customer.toString());

    }
}
