package com.company;

class AnimalTab {
    void eat() {
        System.out.println("eating...");
    }
}

class DogTab extends AnimalTab {
    void bark() {
        System.out.println("barking ...");
    }
}

class CatTab extends AnimalTab {
    void meow () {
        System.out.println("meowing...");
    }
}
public class TestInheritance3 {
    public static void main(String[] args) {
        CatTab c = new CatTab();
        c.meow();
        c.eat();
    }

}
