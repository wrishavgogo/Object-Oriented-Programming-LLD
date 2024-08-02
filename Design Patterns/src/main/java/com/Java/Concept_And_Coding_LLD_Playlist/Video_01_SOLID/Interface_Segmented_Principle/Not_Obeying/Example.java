package com.Java.Concept_And_Coding_LLD_Playlist.Video_01_SOLID.Interface_Segmented_Principle.Not_Obeying;

public class Example {

    /***
     * Interface - Segmented Principle : It says that interfaces should be such , that client
     * should not implement unnecessary methods they don't need
     * */
}

interface RestaurantEmployee {
    void serveFood();
    void cookFood();
}

class Waiter implements RestaurantEmployee {

    public void serveFood() {

    }

    public void cookFood() {
        // waiter does not cook food , so this method is unnecessary here
    }
}

class Chef implements RestaurantEmployee {

    public void serveFood() {
        // chef does not cook food so this method is unnecessary here
    }

    public void cookFood() {

    }

}
