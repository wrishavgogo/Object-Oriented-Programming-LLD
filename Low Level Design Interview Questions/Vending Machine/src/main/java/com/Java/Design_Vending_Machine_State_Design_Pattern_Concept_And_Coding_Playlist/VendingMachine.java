package com.Java.Design_Vending_Machine_State_Design_Pattern_Concept_And_Coding_Playlist;

import javaEngineering.concepts.Youtube.ConceptAndCodingChannel.LLD.Video_16_Design_Vending_Machine_State_Design_Pattern.StateImpl.State;

import java.util.List;

public class VendingMachine {

    List<Coin> coinList;
    public State getState() {
        return state;
    }

    public VendingMachine(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    State state;
}
