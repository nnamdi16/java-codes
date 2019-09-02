package com.company;

//Multilevel Inheritance


class Animals {
    void eat() {
        System.out.println(" eating...");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping ...");
    }
}

public class TestInheritance2 {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
