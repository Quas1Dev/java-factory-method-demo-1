package com.mycompany.factorymethoddemo1.factory;

import com.mycompany.factorymethoddemo1.animal.Animal;
import com.mycompany.factorymethoddemo1.animal.Dog;

public class DogFactory extends AnimalFactory {
    
    @Override
    public Animal createAnimal() {
      return new Dog();        
    }
    
}
