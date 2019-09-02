package com.company;

public class SchoolDetails {
    int rollNo;
    String name, course;
    float fee;
    SchoolDetails(int rollNo,String name, String course) {
       this.rollNo = rollNo;
       this.name = name;
       this.course = course;
    }

    SchoolDetails(int rollNo, String name, String course, float fee) {
        this(rollNo,name,course);
        this.fee = fee;
    }
    void display() {
        System.out.println(rollNo + " " + name + " " + course + " " + fee);
    }

    public static void main(String[] args) {
        SchoolDetails s1 = new SchoolDetails(111,"Dave","Java");
        SchoolDetails s2 = new SchoolDetails(112, "Sarah", "Javascript", 900);
        s1.display();
        s2.display();
    }
}
