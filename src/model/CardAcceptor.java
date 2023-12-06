package model;

import util.MoneyReceiver;

import java.util.Scanner;

public class CardAcceptor implements MoneyReceiver {

    private int amount;

    public CardAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount += amount;
    }

    @Override
    public int getAmount() {
        return 0;
    }

    public void insertCard(Scanner sc){
        System.out.print("Enter card number: ");
        String cardNumber = sc.nextLine();
        System.out.print("Enter card password: ");
        String cardPassword = sc.nextLine();
        System.out.print("Enter amount to pay: ");
        int amount = sc.nextInt();
        setAmount(amount);
    }
}
