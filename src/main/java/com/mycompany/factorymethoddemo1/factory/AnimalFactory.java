package com.mycompany.factorymethoddemo1.factory;

// This is the "blueprint" for the specific

import com.mycompany.factorymethoddemo1.animal.Animal;

// factories.
public abstract class AnimalFactory {
    public abstract Animal createAnimal();
}
