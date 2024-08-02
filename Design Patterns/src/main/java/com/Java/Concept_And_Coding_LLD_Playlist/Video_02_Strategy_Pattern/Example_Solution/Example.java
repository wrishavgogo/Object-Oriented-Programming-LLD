package com.Java.Concept_And_Coding_LLD_Playlist.Video_02_Strategy_Pattern.Example_Solution;

public class Example {

    /**
     * A good question comes , is why do we need this design pattern at all
     * This design pattern improves code reusability
     * */

    public static void main(String[] args) {

        SportVehicle f1Car = new SportVehicle(new RoughDriveStrategy());
        Vehicle jeep = new OffRoadVehicle(new RoughDriveStrategy());

        f1Car.drive();
        jeep.drive();
    }
}

interface DriveStrategy {

    public void drive();
}

class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal drive ");
    }
}

class RoughDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Rough Drive ");
    }
}


class Vehicle {

    DriveStrategy driveStrategy; // having interface instead of concrete implementation
    // Dependency Inversion
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        /**
         * We did not need concrete class to call the method
         * */
        driveStrategy.drive();
    }
}

class PassengerVehicle extends Vehicle {

    public PassengerVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}

class SportVehicle extends Vehicle {

    public SportVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}

class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}

/**
 * Note how we used code reusability to reduce code redundancy
 * **/