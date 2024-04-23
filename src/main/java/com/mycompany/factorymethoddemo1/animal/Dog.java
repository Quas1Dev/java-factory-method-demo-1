package com.mycompany.factorymethoddemo1.animal;

public class Dog implements Animal {
    public Dog(){
        System.out.println("A dog is created!");
    }
    
    @Override
    public void discribeBehavior() {
        System.out.println("It says: Bow-wow!");
        System.out.println("It prefers barking.");
    }
    
}
