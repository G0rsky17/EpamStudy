package com.company;

public class ShowCoinInfo extends CompareCoin {
    CompareCoin compare = new CompareCoin();

    @Override
    public int compareDiameter(Coin first, Coin second) {
        return super.compareDiameter(first, second);
    }
    //System.out.println("The first coin is more than the second for " + delta);
    //System.out.println("Coin have the same diameter");
    //System.out.println("The second coin more than the first on " + -delta);
}
