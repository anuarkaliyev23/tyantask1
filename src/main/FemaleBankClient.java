package main;

/**
 * This class represents Female BankClient
 *
 * @see BankClient
 * */
public class FemaleBankClient extends BankClient{
    /**This field represents amount of kids this client have*/
    private int kids;


    public FemaleBankClient(int age) {
        super(age);
        kids = 0;
    }

    public FemaleBankClient(int age, int kids) {
        super(age);
        this.kids = kids;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }
}
