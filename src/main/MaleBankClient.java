package main;

import java.util.List;
/**
 * This class represents Male BankClient
 *
 * @see BankClient
 * */
public class MaleBankClient extends BankClient {
    /**This field represents if client had served in army*/
    private boolean servedInArmy;

    public MaleBankClient(int age) {
        super(age);
        servedInArmy = false;
    }

    public MaleBankClient(int age, boolean served) {
        super(age);
        servedInArmy = served;
    }

    public boolean haveServedInArmy() {
        return servedInArmy;
    }

    public void setServedInArmy(boolean servedInArmy) {
        this.servedInArmy = servedInArmy;
    }
}
