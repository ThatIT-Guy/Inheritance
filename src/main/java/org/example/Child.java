package org.example;

public class Child extends Parent{
    @Override
    public void parentMethod() {
        System.out.println("This is a method in parent class in child class");
    }

    public void childMethod() {
        System.out.println("This is a method from child class");
    }
}
