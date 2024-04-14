package com.practice.javaBasics;

public class daysOfWeek {
    public static String weekDays(String D,int j)
    {
        String[] dayOfWeek={"mon","tue","wed","thu","fri","sat","sun"};
        int index=0;

        for(int i=0;i<dayOfWeek.length;i++)
        {
            if(dayOfWeek[i].equals(D))
            {
                index=i;
            }
        }
        index=(index+j)%7;

        return dayOfWeek[index];

    }
    public static void main(String[] args) {

        System.out.println(weekDays("mon",7));
    }



}
