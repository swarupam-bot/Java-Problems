package com.practice.javaBasics;

public class febonacchiseries {
    public static void main(String[] args) {
        int firstNum=0;
        int secondNum=1;
        int givenNum=20;
        for(int i=0;i<givenNum;i++)
        {
            System.out.println(firstNum);
            int nextTerm=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextTerm;



        }
    }
}
