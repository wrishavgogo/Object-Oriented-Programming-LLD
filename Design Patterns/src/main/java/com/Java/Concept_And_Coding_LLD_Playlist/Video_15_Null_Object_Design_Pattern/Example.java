package com.Java.Concept_And_Coding_LLD_Playlist.Video_15_Null_Object_Design_Pattern;

public class Example {

    /**
     * Just in factory pattern instead of returning null object
     * create a class NullObject and have some default implementation for that
     * **/

    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        // now we are not scared to handle null pointer exception
        // because we have provided its implementation
        vehicle.getWheels();
    }
}


interface Vehicle {

    public int getWheels();
    public int getSeatingCapacity();
}

class VehicleFactory {

    public static Vehicle getVehicleObject (String vehicle) {


        return switch (vehicle) {
            case "Bike" -> new Bike();
            default -> new NullObject();
        };
    }
}

class Bike implements Vehicle {

    public int getWheels() {
        return 2;
    }
    public int getSeatingCapacity() {
        return 2;
    }
}

class NullObject implements Vehicle {

    public int getWheels() {
        return 0;
    }

    public int getSeatingCapacity() {
        return 0;
    }
}
