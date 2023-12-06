package model;

import util.MoneyReceiver;

public class CardAcceptor implements MoneyReceiver {

    private int amount;

    public CardAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public void setAmount(int amount) {

    }

    @Override
    public int getAmount() {
        return 0;
    }


}
