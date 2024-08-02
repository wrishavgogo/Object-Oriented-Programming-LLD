package com.Java.Concept_And_Coding_LLD_Playlist.Video_01_SOLID.Liskov_Substitution_Principle.Obeying;

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
/**
 * To solve this problem
 * Keep very generic methods in the interface or parent class
 * **/
interface Bike {

   /**
    * Removed the turn on Engine method as some bikes may not have engine
    * Hence problem solved
    * */
    public void accelerate();
}

class MotorCycle implements Bike {

    boolean engineOn = false;
    int speed = 0;


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
    public void accelerate() {
        speed += 1;
    }
}
