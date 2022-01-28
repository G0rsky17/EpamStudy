package com.company;

public class ShowCoinInfo {
    public void informer(int result){
        if(result == 1){
            System.out.println("The first coin is more than the second for ");
        }
        else if(result == -1){
            System.out.println("The second coin more than the first on ");
        }
        else if(result == 0){
            System.out.println("Coin have the same diameter");
        }

    }
}
