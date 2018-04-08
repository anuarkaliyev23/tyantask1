package main;

/**
 * This class represents Bank
 * */
public class Bank {

    /**
     * Empty constructor so no object could be created.
     * */
    private Bank() {
        //do nothing
    }

    private static int FEMALE_MIN_KIDS_FOR_EXEMPTION = 2;

    private static double TWENTY_FIVE_OR_LESS_RATE = 0.07;
    private static double FIFTY_OR_LESS_RATE = 0.2;
    private static double SEVENTY_FIVE_OR_LESS_RATE = 0.15;
    private static double SEVENTY_FIVE_OR_OLDER_RATE = 0.07;

    private static double MALE_EXEMPTION_DIVIDER = 1.5;
    private static double FEMALE_EXEMPTION_DIVIDER = 2.0;



    public static Credit calculateCredit(BankClient client, int amount, int term) throws UnderageClientException {
        double interestRate = calculateInterestRate(client.age);

        if (client instanceof MaleBankClient) {
            if (haveExemption((MaleBankClient) client)) {
                interestRate /= MALE_EXEMPTION_DIVIDER;
            }
        } else {
            if (haveExemption((FemaleBankClient) client)) {
                interestRate /= FEMALE_EXEMPTION_DIVIDER;
            }
        }

        Credit credit = new Credit(term, amount, interestRate);
        return credit;
    }

    private static double calculateInterestRate(int age) throws UnderageClientException {
        if (age < 18) throw new UnderageClientException();
        if (age <= 25) return TWENTY_FIVE_OR_LESS_RATE;
        else if (age <= 50) return FIFTY_OR_LESS_RATE;
        else if (age <= 75) return SEVENTY_FIVE_OR_LESS_RATE;
        else return SEVENTY_FIVE_OR_OLDER_RATE;
    }

    private static boolean haveExemption(FemaleBankClient client) {
        return client.getKids() >= FEMALE_MIN_KIDS_FOR_EXEMPTION;
    }

    private static boolean haveExemption(MaleBankClient client) {
        return client.haveServedInArmy();
    }

}
