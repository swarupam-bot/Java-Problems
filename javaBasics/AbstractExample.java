package com.practice.javaBasics;
abstract class AbstractJava {

    private String animalSound;


    String name="meow";

}
class Dog extends AbstractJava{
    String animalSound(){
        String sondDog="Bark";
        return sondDog;
    }
}
class Cat extends AbstractJava{
    String animalSound(){
        return name;
    }
}
public class AbstractExample{

    public static void main(String[] args) {
        Dog DG=new Dog();
        System.out.println(DG.animalSound());

        Cat CT=new Cat();
        System.out.println(CT.animalSound());
    }
}
