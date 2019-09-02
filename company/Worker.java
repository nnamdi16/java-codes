package com.company;

public class Worker {
    //Calling parameterized constructor from default constructor
    Worker() {
       this(5);
        System.out.println("hello a");
    }

    Worker(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
    }
}
