package com.company;
//Java Program to demonstrate the use of static variable.

public class Student {
    private int rollNo; //Instance variable or field
    String name;
    static  int count = 0;
    static String college = "ITS"; //static variable.

    //Constructor
    Student() {
        System.out.println("The showman");
    }
    Student(int rollNo, String name) {
        this();
        count++;
        //We use the this keyword to differentiate between instance variable and local variable.
        //If the local variable and the this key word are different there would be no need for the this
        this.name = name;
        this.rollNo = rollNo;
        System.out.println(count);

    }

    //method to display the values
    public void display () {
        System.out.println(rollNo + " " + name + " " + college );
    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan" + " " + count);
        Student s2 = new Student(222, "Aryan" + " " + count );
        s1.display();
        s2.display();
    }
}
