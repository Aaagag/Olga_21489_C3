import Paczka.Account;
import Paczka.Customer;


    public class TestAccount {
        public TestAccount() {
        }

        public static void main(String[] args) {
            Customer customer = new Customer(1234, "Ola", 10);
            Account account = new Account(4321, customer, 150.0);
            System.out.println(account.toString());
            System.out.println(account.withdraw(50.0));
        }
    }

