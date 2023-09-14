package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Parent p = new Parent();
        Child c = new Child();
        GrandChild g = new GrandChild();
//        the below object creation is an example of upcasting
        Parent p1 = new Child();
//        the use of this is that even though it will print the method from child class
//        you can only access the p1.parentMethod because we are creating a reference p1 of parent class
//        so even though the output will be overriden by child class as the object is of child class
//        but we will only be able to access the methods that are defined in Parent class only

        p.parentMethod();
        c.parentMethod();
        c.childMethod();
        g.parentMethod();
        g.childMethod();
        g.grandChildMethod();
        p1.parentMethod();
    }
}