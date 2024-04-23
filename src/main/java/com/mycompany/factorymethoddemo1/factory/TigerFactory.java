package com.mycompany.factorymethoddemo1.factory;

import com.mycompany.factorymethoddemo1.animal.Animal;
import com.mycompany.factorymethoddemo1.animal.Tiger;

public class TigerFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
    
}
