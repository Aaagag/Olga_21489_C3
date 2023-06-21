package Paczka;

import static Paczuszka.Stringi.*;

public class Account extends Customer {
    private int id;
    private Customer customer;
    private double balance = 0.0;
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getId() {
        return this.id;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        String var10000 = this.customer.toString();
        return var10000 = stanKonta() + this.balance;
    }
    public String getCustomerName() {
        return this.customer.getName();
    }
    public Account deposit(double amount) {
        this.balance += amount;
        return null;
    }
    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(this.balance);
            System.out.println(potwierdzenie());
        } else {
            System.out.println(odmowa());
        }
        return null;
    }
}
