package com.Java.Concept_And_Coding_LLD_Playlist.Video_01_SOLID.Liskov_Substitution_Principle.Not_Obeying;

public class Example {

    /**
     * If Class B , is a subtype of Class A , then we should be able to
     * replace Object of A , without breaking the behaviour of the program
     *
     * ClassA(parent) ----> ClassB(child)
     * Lets say class has a method , save()
     *
     * ClassA objA = new ClassA();
     * ClassB objB = new ClassB();
     *
     * if in the code somewhere we have
     * objA.save() ,
     * and we replace it with
     * objB.save()
     *
     * Then if behaviour of program does not change , then we say
     * Liskov's Substitution Principle has been followed
     *
     * ***
     * Basically Subclass should always extend the capability of the parent class
     * and not narrow it down
     * **/
}

interface Bike {

    public void turnOnEngine();
    public void accelerate();
}

class MotorCycle implements Bike {

    boolean engineOn = false;
    int speed = 0;

    @Override
    public void turnOnEngine() {
        engineOn = true;
    }

    @Override
    public void accelerate() {
        speed += 10;
    }
}

class Bicycle implements Bike {

    int speed = 0;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("no engine found");
        /**
         * This is reducing the capability of the Bike interface ,
         * it is throwing error ,
         * Suppose ,
         *
         * Bike bike = new Bicycle();
         * bike.turnOnEngine() ---> will throw error
         *
         * so it's reducing the capability of the parent class
         * **/
    }

    @Override
    public void accelerate() {
        speed += 1;
    }
}
