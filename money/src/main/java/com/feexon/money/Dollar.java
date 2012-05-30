package com.feexon.money;

/**
 * @author Administrator
 * @version 1.0 12-5-30,下午10:55
 */
public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        amount *= multiplier;
        return new Dollar(amount);
    }
}
