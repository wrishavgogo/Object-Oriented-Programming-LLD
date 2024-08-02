package com.Java.Concept_And_Coding_LLD_Playlist.Video_01_SOLID.Single_Responsibility_Principle.Not_Obeying;

public class Example_Of_Not_Obeying_Single_Responsibility {

    /**
     * The following example does not obey Single Responsibility Principle
     * */

    /**
     * The invoice class has 3 reasons to change
     * */
}

class Marker {

    String name;
    String color;
    int year;
    int price;

    public Marker(String name , String color , int year , int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }

}

class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker , int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateCost() {
        // some implementation
        int cost = 123;
        return cost;

        /**
         * 1st reason to change , lets say tomorrow we want to change the cost
         * calculation
         * **/
    }

    public void printInvoice() {
        // some implementation to print
        /**
         * 2nd reason to change , lets say we want to print to a different printer
         * and implementation has to be changed
         * **/
    }

    public void saveToDb() {
        // some implementation
        /**
         * 3rd reason , now we want to save to CSV instead of Db
         * */
    }
}
