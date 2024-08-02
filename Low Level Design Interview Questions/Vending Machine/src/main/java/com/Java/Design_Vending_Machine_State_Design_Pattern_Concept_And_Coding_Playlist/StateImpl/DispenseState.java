package com.Java.Design_Vending_Machine_State_Design_Pattern_Concept_And_Coding_Playlist.StateImpl;

import Design_Vending_Machine_State_Design_Pattern_Concept_And_Coding_Playlist.VendingMachine;
import javaEngineering.concepts.Youtube.ConceptAndCodingChannel.LLD.Video_16_Design_Vending_Machine_State_Design_Pattern.Coin;

public class DispenseState implements State{

    public DispenseState() {
        // whenever dispense state is reached print this
        System.out.println("here's your product and here's your change");
    }

    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        // error
    }

    public void clickOnSelectProductButton(VendingMachine vendingMachine, String productCode) {
        //error
    }

    public void insertCoin(Coin coin , VendingMachine vendingMachine) {
        //error
    }

    public void clickOnCancelButton(VendingMachine vendingMachine) {
        //error
    }
}
