package com.mycompany.factorymethoddemo1;

import com.mycompany.factorymethoddemo1.factory.AnimalFactory;
import com.mycompany.factorymethoddemo1.factory.TigerFactory;
import com.mycompany.factorymethoddemo1.factory.DogFactory;
import com.mycompany.factorymethoddemo1.animal.Animal;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println("*** A Factory Method demo. ***");
        
        AnimalFactory factory = new DogFactory();
        Animal dog = factory.createAnimal();
        dog.discribeBehavior();
        
        System.out.println("\n**************\n");
        
        factory = new TigerFactory();
        Animal tiger =  factory.createAnimal();
        tiger.discribeBehavior();
    }
}
