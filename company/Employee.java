package com.company;

public class Employee {
    float salary = 40000;
}

class Programmer extends Employee {
    int bonus = 10000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is : " + p.salary);
        System.out.println("Total package is " + p.salary + p.bonus);
    }
}

//Single Inheritance
class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class  Dog extends  Animal {
    void bark () {
        System.out.println(" barking ...");
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}