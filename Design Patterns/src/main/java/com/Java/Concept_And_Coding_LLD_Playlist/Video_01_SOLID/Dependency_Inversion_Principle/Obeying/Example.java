package com.Java.Concept_And_Coding_LLD_Playlist.Video_01_SOLID.Dependency_Inversion_Principle.Obeying;

public class Example {

    /**
     * Classes should Depend on interfaces rather than concrete class
     * */
}

interface Keyboard {

}

interface Mouse {

}

class BluetoothKeyboard implements Keyboard {

}

class BluetoothMouse implements Mouse {

}


class WiredKeyboard implements  Keyboard {

}

class WiredMouse  implements  Mouse {

}

class MacBook {

    private Keyboard keyboard;
    private Mouse mouse;

    /**
     * If you see , here the attributes are based on concrete classes
     * which should not be the case ,
     * what if tomorrow bluetoothKeyboard comes and Macbook wants to use that
     * */
    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;

        /**
         * Pass Accordingly into the constructor
         * if you want bluetooth or wired
         * or mix
         * In future new implementation comes you can use that
         * */
    }
}
