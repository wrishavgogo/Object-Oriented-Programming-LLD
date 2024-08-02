package com.Java.Concept_And_Coding_LLD_Playlist.Video_01_SOLID.Dependency_Inversion_Principle.Not_Obeying;

public class Example {

    /**
     * Classes should Depend on interfaces rather than concrete class
     * */
}

class WiredKeyboard {

}

class WiredMouse {

}

class MacBook {

    private WiredKeyboard wiredKeyboard;
    private WiredMouse wiredMouse;

    /**
     * If you see , here the attributes are based on concrete classes
     * which should not be the case ,
     * what if tomorrow bluetoothKeyboard comes and Macbook wants to use that
     * */
    public MacBook(WiredKeyboard wiredKeyboard , WiredMouse wiredMouse) {
        this.wiredKeyboard = wiredKeyboard;
        this.wiredMouse = wiredMouse;
    }
}
