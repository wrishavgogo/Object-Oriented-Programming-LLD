package com.Java.Design_Vending_Machine_State_Design_Pattern_Concept_And_Coding_Playlist;

public enum Coin {

    ONE_RUPEE(1),
    TWO_RUPEES(2),
    FIVE_RUPEES(5),
    TEN_RUPEES(10),
    TWENTY_RUPEES(20);

    public int val;

    Coin(int val) {
        this.val = val;
    }
}
