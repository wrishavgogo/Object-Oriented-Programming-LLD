package com.Java.Design_Vending_Machine_State_Design_Pattern_Concept_And_Coding_Playlist.StateImpl;

import Design_Vending_Machine_State_Design_Pattern_Concept_And_Coding_Playlist.VendingMachine;
import javaEngineering.concepts.Youtube.ConceptAndCodingChannel.LLD.Video_16_Design_Vending_Machine_State_Design_Pattern.Coin;

public class InsertMoneyState implements State{

    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("please insert coins into the machine ");
    }

    public void clickOnSelectProductButton(VendingMachine vendingMachine , String productCode) {

    }

    public void insertCoin(Coin coin , VendingMachine vendingMachine) {

    }

    public void clickOnCancelButton(VendingMachine vendingMachine) {
        // return all the money inserted into the vending machine
        vendingMachine.setState(new IdleState());
    }
}
