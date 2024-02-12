package com.practice.javaBasics.polyMorphism;

public class PolyMorMain {
    public static void main(String[] args) {
        animalsound sound=new cat();
        sound.animalSound();
        sound.animalSound(6);


        animalsound sound2=new Dog();
        sound2.animalSound();

       // animalsound sound3=new cat();


    }
}
