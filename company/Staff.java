package com.company;
//Calling default constructor from parameterized constructor
public class Staff {
    Staff() {
        System.out.println("Hello A ");
    }

    Staff(int x) {
       this();
        System.out.println(x);
    }

    public static void main(String[] args) {
        Staff staff1 = new Staff(10);
    }
}
