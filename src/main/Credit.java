package main;

/**
 * This class represents single credit given by a bank
 * */
public class Credit {
    /**
     * Term property is a time interval for which credit was taken
     * */
    private int term;

    /**
     * Amount is a total amount of money that were loaned
     * */
    private int amount;

    /**
     * interestRate is a property that represents interest rate in double format.
     * e.g. 0.05 - 5% interest rate
     * */
    private double interestRate;

    /**
     * Fully-parametrized constructor
     *
     * @param term - value to which {@link #term}property will be set
     * @param amount - value to which {@link #amount} property will be set
     * @param interestRate - value to which {@link #interestRate} property will be set
     * */
    public Credit(int term, int amount, double interestRate) {
        this.term = term;
        this.amount = amount;
        this.interestRate = interestRate;
    }

    /**
     * Standard getter for {@link #term} property
     *
     * @return {@link #term} property value
     * */
    public int getTerm() {
        return term;
    }

    /**
     * Standard setter for {@link #term} property
     *
     * @param term - value to which {@link #term}property will be set
     * */
    public void setTerm(int term) {
        this.term = term;
    }

    /**
     * Standard getter for {@link #amount} property
     *
     * @return {@link #amount} property value
     * */
    public int getAmount() {
        return amount;
    }

    /**
     * Standard setter for {@link #term} property
     *
     * @param amount - value to which {@link #amount} property will be set
     * */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Standard getter for {@link #interestRate} property
     *
     * @return {@link #interestRate} value
     * */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Standard setter for {@link #interestRate} property value
     *
     * @param interestRate - value to which {@link #interestRate} property will be set
     * */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * This method calculates annual fee, that must be paid by {@link BankClient}
     *
     * @return calculated annual fee
     * */
    public double calculateAnnualFee() {
        /*(double) внизу называется кастинг. Он переводит значение перед скобками в double. Это нужно, чтобы он воспринимал
        * amount как double. А это нужно, чтобы при делении он дал не только целый остаток (div) но дробный результат.*/
        return (( (double)amount / term) + (amount * interestRate));
    }
}
