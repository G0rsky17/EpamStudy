package com.company;

public class CompareCoin {
    public int compareDiameter(Coin first, Coin second){
        double delta = first.getDiameter() - second.getDiameter();
        int result = 0;
        if(delta > 0){
            result = 1;
        } else if (delta < 0){
            result = -1;
        }
        return result;
    }
}
