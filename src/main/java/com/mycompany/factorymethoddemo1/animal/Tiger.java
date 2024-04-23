package com.mycompany.factorymethoddemo1.animal;

public class Tiger implements Animal {
    
    public Tiger(){
        System.out.println("A tiger is created!");
    }
    
    @Override
    public void discribeBehavior() {
        System.out.println("It says: Halum!");
        System.out.println("It loves to roam in the jungle!");
    }
    
}
