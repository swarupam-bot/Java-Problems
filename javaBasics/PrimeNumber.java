package com.practice.javaBasics;

public class PrimeNumber {
    static boolean findPrimeNumber(int num)
    {
        if(num<=1){
            return false;
        }
        for (int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num=15;
        if(findPrimeNumber(num)){
            System.out.println(num+" is a prime number.");

        }
        else {
            System.out.println(num+" is not a prime number.");
        }
    }
}
