package com.practice.javaBasics.polyMorphism;

public class cat extends animalsound {
    @Override
    public void animalSound() {
        System.out.println("cat meow ");
    }

   // @Override
    public void animalSound(int a)
    {
        for (int i=0;i<a;i++)
        {
            System.out.print("Meow ! ");
        }

    }

}
