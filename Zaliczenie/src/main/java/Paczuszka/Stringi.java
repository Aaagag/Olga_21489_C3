package Paczuszka;

import Paczka.Customer;

public class Stringi extends Customer {
    public static String odmowa() {
        return "Amount withdrawn exceeds the current balance!";
    }
    public static String potwierdzenie() {
        return "Done!";
    }
    public static String stanKonta() {
        return "The account balance is: $";
    }
}

