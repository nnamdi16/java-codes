package com.company;

public class Event {
    void m(Event obj) {
        System.out.println("Method is invoked");
    }

    void p () {
        //This passed as an argument in the method. Mainly used in event handling.
        m(this);
    }

    public static void main(String[] args) {
        Event s1 = new Event();
        s1.p();
    }
}
