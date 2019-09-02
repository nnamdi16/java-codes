package com.company;
//Super
public class AnimalKingdom {
    String color = "white";
    AnimalKingdom() {
        System.out.println(" Animal is created");
    }
    void eat() {
        System.out.println("eating ...");
    }

}


class Buffalo extends AnimalKingdom {
     Buffalo(){
         super();
     }
    String color = "black";


    //Super to refer to immediate parent class instance variable
    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
    //Overriding parent class method
    void eat () {
        System.out.println("eating bread...");
    }
    void bark() {
        System.out.println("barking...");
    }
    void work(){
        //Super used to invoke parent class method
        super.eat();
        bark();
    }

}

class  TestSuper1 {
    public static void main(String[] args) {
        Buffalo b = new Buffalo();
        b.printColor();
        b.work();
    }
}