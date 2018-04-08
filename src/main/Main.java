package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankClient client;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you male? (true/false)");
        boolean sex = scanner.nextBoolean();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (sex) {
            System.out.println("Have you served in army? (true/false)");
            boolean served = scanner.nextBoolean();
            client = new MaleBankClient(age, served);
        } else {
            System.out.println("How many kids do you have?");
            int kids = scanner.nextInt();
            client = new FemaleBankClient(age, kids);
        }

        System.out.println("Credit's term: ");
        int term = scanner.nextInt();
        System.out.println("Credit's amount: ");
        int amount = scanner.nextInt();

        try {
            Credit credit = Bank.calculateCredit(client, amount, term);
            System.out.print("Your interest rate: ");
            System.out.println(credit.getInterestRate());
        } catch (UnderageClientException e) {
            System.out.println("You are underage to claim for credit");
        }
    }
}
