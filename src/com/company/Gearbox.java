package com.company;

public class Gearbox {
    private boolean clutchIsIn;

    public void operateclutch(boolean inOrOut /*String inOrOut*/) {
        //this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
        this.clutchIsIn = inOrOut;
    }
}
