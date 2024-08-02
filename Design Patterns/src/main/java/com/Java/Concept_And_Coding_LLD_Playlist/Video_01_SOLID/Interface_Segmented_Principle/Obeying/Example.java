package com.Java.Concept_And_Coding_LLD_Playlist.Video_01_SOLID.Interface_Segmented_Principle.Obeying;

public class Example {

    /***
     * Interface - Segmented Principle : It says that interfaces should be such , that client
     * should not implement unnecessary methods they don't need
     * */
}

interface WaiterInterface {

    void serveFood();
    void takeOrder();
}

interface ChefInterface {

    void cookFood();
    void washDishes();
}



class Waiter implements WaiterInterface{

    public void serveFood() {

    }

    public void takeOrder() {

    }
}

class Chef implements ChefInterface {


    public void cookFood() {

    }

    public void washDishes() {

    }


}
