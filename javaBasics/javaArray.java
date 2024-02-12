package com.practice.javaBasics;

import java.util.Scanner;

public class javaArray {
    public static void main(String[] args) {
        int num;
        int factorial=1;
       // Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the num which factorial u want");
       // num= sc.nextInt();
        num=10;
        for (int i=1;i<num;i++)
        {
            factorial*=i;
        }

        System.out.println(factorial);




        int[] array = {2, 10, 7, 25, 15,45,54,65};
        int largest = array[0]; // Assume the first element is the largest

        for (int i = 1; i < array.length; i++) {
           // System.out.println(largest);
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);

    }


}
