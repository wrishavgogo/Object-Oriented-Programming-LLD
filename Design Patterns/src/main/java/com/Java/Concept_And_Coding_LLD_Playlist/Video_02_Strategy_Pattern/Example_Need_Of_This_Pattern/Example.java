package com.Java.Concept_And_Coding_LLD_Playlist.Video_02_Strategy_Pattern.Example_Need_Of_This_Pattern;

public class Example {

    /**
     * A good question comes , is why do we need this design pattern at all
     * This design pattern improves code reusability
     * */
}


class Vehicle {

    public void drive() {
        System.out.println("Normal Drive");
    }
}

class PassengerVehicle extends Vehicle {

    /**
     * No need to implement drive as we are getting from parent class
     * PassengerVehicle does Normal Drive only
     * */
}

class SportVehicle extends Vehicle {

    @Override
    public void drive() {
        System.out.println("rough drive");
    }
}

class OffRoadVehicle extends Vehicle {

    @Override
    public void drive() {
        System.out.println("rough drive");
    }
}

/**
 * Note how like 31 and 39 and duplicate and code is not reused here
 * It could have been much bigger implementation
 * That's what stategy pattern solves
 * **/