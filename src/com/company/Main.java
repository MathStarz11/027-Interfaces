package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone; //Declare the implemented class for object here
        timsPhone = new DeskPhone(123456); //declare the type of telephone here

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(234565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
