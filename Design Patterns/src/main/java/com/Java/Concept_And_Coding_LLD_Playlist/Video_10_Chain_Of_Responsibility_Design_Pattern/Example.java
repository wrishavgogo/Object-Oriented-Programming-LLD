package com.Java.Concept_And_Coding_LLD_Playlist.Video_10_Chain_Of_Responsibility_Design_Pattern;

import java.util.Objects;

public class Example {

    /**
     * This design pattern
     * basically tries to form a chain (LinkedList kind of Structure )
     *
     * And once the request gets taken into the server
     * it goes through the processor chain 1 by 1 till
     * the request is satisfied by any of the processor
     *
     *
     * this design pattern is used for designing
     *
     * ATM machine , Logger (Info, Debug , Error )
     * ***/


    public static void main(String[] args) {

        // info --> Debug ---> Error
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.processMessage("Logger implementation" , 2);
        logProcessor.processMessage("debug mode testing" , 1);
    }
}


abstract class LogProcessor {

    /**
     * This is the abstract class ,
     * which will be implemented by different types of Processors
     * **/
    final static int INFO = 0;
    final static  int DEBUG = 1;
    final static int ERROR = 2;

    private LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void processMessage(String message , int logLevel) {
        if(Objects.isNull(nextLogProcessor)) {
            System.out.println("message does not fall into any criteria");
        }
        else {
            nextLogProcessor.processMessage(message , logLevel);
        }

    }

}

class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor logProcessor) {
        /***
         * Trying to set nextLogProcessor pointer
         * */
        super(logProcessor);
    }

    public void processMessage(String message , int logLevel) {

        if(logLevel == INFO) {
            System.out.println(message + " processed in Info Mode");

        } else {
            super.processMessage(message , logLevel);
        }

    }
}

class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor logProcessor) {

        super(logProcessor);
    }

    public void processMessage(String message , int logLevel) {

        if(logLevel == DEBUG) {
            System.out.println(message + " processed in Debug Mode");
        }
        else {
            super.processMessage(message , logLevel);
        }
    }
}

class ErrorLogProcessor  extends LogProcessor {

    public ErrorLogProcessor(LogProcessor logProcessor) {

        super(logProcessor);
    }

    public void processMessage(String message , int logLevel) {

        if(logLevel == ERROR) {
            System.out.println(message + " processed in Error Mode");
        }
        else {
            super.processMessage(message , logLevel);
        }
    }
}




