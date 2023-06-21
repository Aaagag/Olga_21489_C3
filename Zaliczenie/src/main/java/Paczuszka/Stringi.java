package Paczuszka;

import Paczka.Customer;

public class Stringi extends Customer {
    public static String odmowa() {
        return "Niewystarczające środki na koncie!";
    }
    public static String potwierdzenie() {
        return "Operacja udana!";
    }
}

