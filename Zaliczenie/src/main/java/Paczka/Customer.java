
package Paczka;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
    }

    public Customer() {
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }

    public String toString() {
        return this.name + "(" + this.id + ")";
    }
}
