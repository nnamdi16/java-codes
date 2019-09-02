package com.company;

public class Person {
    int id;
    String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employ extends Person {
    float salary;
    public Employ(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    void display () {
        System.out.println(id + " " + name + " " + salary);
    }
}

/**
 * This class is a user defined class
 * @param: we wish
 */

class TestSuper5 {
    public static void main(String[] args) {
        Employ e1 = new Employ(1, "Sander", 45000f);
        e1.display();
    }
}