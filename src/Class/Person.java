package Class;

import Interface.Payable;

public class Person implements Payable, Comparable<Person> {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = id_gen++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0.00;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }

    @Override
    public String toString() {
        return getId() + ". " + getName() + " " + getSurname();
    }
}


