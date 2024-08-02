package com.Java.Concept_And_Coding_LLD_Playlist.Video_01_SOLID.Open_Closed_Principle.Obeying;

public class Example_Of_Not_Obeying_Single_Responsibility {

    /**
     * The following example does obey Open/Closed Principle
     * */

    /**
     * Open for extension closed for modification
     * */

    /**
     * Let's say a requirement comes that along with save to DB
     * we have to save to file as well
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
    }

}

interface InvoiceDao {

    public void save(Invoice invoice);
}

class DataBaseInvoiceDao implements InvoiceDao {


    @Override
    public void save(Invoice invoice) {
        // save to db
    }
    /**
     * The current class is Live in production and taking traffic
     * */


}

class FileInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        // save to file
    }
    /**
     * As per requirement , we have created a new class
     * which extended for modification ,
     * but did not modify existing class
     * */
}

class InvoicePrinter {

    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        // implementation
    }
}
