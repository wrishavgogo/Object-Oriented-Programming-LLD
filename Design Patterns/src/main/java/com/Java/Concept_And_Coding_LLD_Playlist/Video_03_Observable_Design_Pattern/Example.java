package com.Java.Concept_And_Coding_LLD_Playlist.Video_03_Observable_Design_Pattern;

import java.util.List;

public class Example {

    /***
     * Interview question .
     * Online shopping website is there
     * Sometimes a subscriber wants to get notified
     * that an item which was out of stock returns back to inventory
     * we have to notify him
     *
     * Similarly any new episode is released we want to get notified
     * **/


}

/**
 * Observable is what is being observed
 * */
interface Observable {

    /**
     *  few apis we will be exposing to the client
     *  so that they can add / remove observers
     *
     * **/

    /**
     * To add subscriber
     * */
    void addUser(Observer observer);

    /**
     * To unsubscribe
     * **/
    void removeUser(Observer observer);

    /**
     * To notify all the subscribers
     * */
    void notifyUsers();
}

class Item implements Observable {

    List<Observer> observerList;
    boolean itemAvailable = false;

    public Item(List<Observer> observerList) {

        this.observerList = observerList;
    }

    public void setItemAvailable(boolean itemAvailable) {
        this.itemAvailable = itemAvailable;
        if(itemAvailable == true) {
            notifyUsers();
        }
    }

    @Override
    public void addUser(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeUser(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyUsers() {

        for( Observer observer : observerList) {
            observer.sendNotification();
        }
    }

}

/**
 * The customer who is observing
 * */
interface Observer {

    /**
     * For observer you can create a concrete class customer
     * and for the sendNotification()
     * you can send mail to the email id
     * **/
    void sendNotification();
}


