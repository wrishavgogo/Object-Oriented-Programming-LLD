package com.Java.Design_Vending_Machine_State_Design_Pattern_Concept_And_Coding_Playlist.StateImpl;

import Design_Vending_Machine_State_Design_Pattern_Concept_And_Coding_Playlist.VendingMachine;
import javaEngineering.concepts.Youtube.ConceptAndCodingChannel.LLD.Video_16_Design_Vending_Machine_State_Design_Pattern.Coin;

public class IdleState implements State{

    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setState(new InsertMoneyState());
    }

    public void clickOnSelectProductButton(VendingMachine vendingMachine, String productCode) throws RuntimeException{
        throw  new RuntimeException("first insert coin to select product");
    }

    public void insertCoin(Coin coin , VendingMachine vendingMachine) throws RuntimeException {
        throw  new RuntimeException("first click on insert coin button");
    }

    public void clickOnCancelButton(VendingMachine vendingMachine) {
        // do nothing already on cancel state
    }
}
