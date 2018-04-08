package main;

import java.util.ArrayList;
import java.util.List;

/**
 * This is base class that represents Bank client.
 * It is abstract, that means no objects of it can be created
 * */

abstract class BankClient {
    /**This property represents age of client*/
    protected int age;
    /**This property represents all credits this client have*/
    protected List<Credit> credits;

    public BankClient(int age) {
        this.age = age;
        this.credits = new ArrayList<>();
    }

    /**
     * Standard getter
     * */
    public int getAge() {
        return age;
    }

    /**Standard setter*/
    public void setAge(int age) {
        this.age = age;
    }

    /**Standard getter*/
    public List<Credit> getCredits() {
        return credits;
    }

    /**Standard setter*/
    public void setCredits(List<Credit> credits) {
        this.credits = new ArrayList<>(credits);
    }

    /**
     * This method adds new credit to client
     * */
    public void addCredit(Credit credit) {
        credits.add(credit);
    }
}
