package com.Java.Concept_And_Coding_LLD_Playlist.Video_01_SOLID.Single_Responsibility_Principle.Obeying;

public class Example_Of_Not_Obeying_Single_Responsibility {

    /**
     * The following example obeys Single Responsibility Principle
     * */

    /**
     * We break invoice into two separate classes
     * InvoiceDao -> which will take the responsibility of saving file to DB
     * InvoicePrinter -> which will take the responsibility of printing Invoice
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
         * Only 1 reason to change now
         * **/
    }

    /***
     * We removed the functionality of
     * saving to Database and printing
     * to separate classes
     * */


}

class InvoiceDao {
    private  Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDb() {
        // implementation
        /**
         * Only 1 reason to change
         * */
    }
}

class InvoicePrinter {

    private  Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        // implementation
        /**
         * Only 1 reason to change
         * */
    }
}
