package com.Java.Concept_And_Coding_LLD_Playlist.Video_20_Adapter_Design_Pattern.Adapter;

import javaEngineering.concepts.Youtube.ConceptAndCodingChannel.LLD.Video_20_Adapter_Design_Pattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    public int getWeightInKgs() {

        int weightInPounds = weightMachine.getWeightInPounds();
        // some operations and converting in kgs
        int weightInKgs = ( weightInPounds / 100 ) * 50 + 150;
        return weightInKgs;
    }
}
