package org.example;
public class GrandChild extends Child{
    @Override
    public void parentMethod() {
        System.out.println("This is a method in parent class in grandChild class");
    }

    public void childMethod() {
        System.out.println("This is a method from child class in grandChild class");
    }

    public void grandChildMethod() {
        System.out.println("This is a method from grandChild class");
    }
}
