package com.Java.Concept_And_Coding_LLD_Playlist.Video_20_Adapter_Design_Pattern.Client;

import Concept_And_Coding_LLD_Playlist.Video_20_Adapter_Design_Pattern.Adaptee.WeightMachineImpl;
import Concept_And_Coding_LLD_Playlist.Video_20_Adapter_Design_Pattern.Adapter.WeightMachineAdapter;
import Concept_And_Coding_LLD_Playlist.Video_20_Adapter_Design_Pattern.Adapter.WeightMachineAdapterImpl;

public class Example {

    public static void main(String[] args) {

        /***
         * Advantage of this method is that you
         * can write different adapter interface and not make changes into the existing one
         * incase client wants to change functionality
         * ***/

        // passing adaptee into the adapter
        WeightMachineAdapter adapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(adapter.getWeightInKgs());
    }

    public synchronized void  add() {



    }

}
