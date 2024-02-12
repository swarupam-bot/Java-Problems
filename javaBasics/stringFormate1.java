package com.practice.javaBasics;

import java.util.Scanner;

public class stringFormate1 {
    public static void main(String[] args) {
//        int [] arr = {2, 3, 1, 5, 4, 6};
//        int k=2;
//        int m=3;

        Scanner scn=new Scanner(System.in);
        String a=scn.nextLine();
        String b=scn.nextLine();
        String c=scn.nextLine();
        StringBuilder l= new StringBuilder(" ");
        String [] arr={a,b,c};

        int m=0;

        System.out.println("================================");
        for (String i:arr)
        {
            String[] x=i.split(" ");
            if(x[1].length()<3)
            {
                if(x[1].length()<2)
                {
                    x[1]="00"+x[1];

                }
                else {

                    x[1] = "0" + x[1];
                }

                m=Integer.parseInt(x[1]);


            }
            m=Integer.parseInt(x[1]);
         int j=17-x[0].length()+x[1].length();
            l.append(" ".repeat(Math.max(0, j)));
            System.out.println(x[0]+l+x[1]);
            l.replace(0,j,"");
        }
        System.out.println("================================");




//        String[] i=a.split(" ");
//        String[] j=b.split(" ");
//        String[] k=c.split(" ");
//
 //       System.out.println("================================");
//        System.out.println(i[0]+"           "+i[1]);
//        System.out.println(j[0]+"           "+j[1]);
//        System.out.println(k[0]+"           "+k[1]);
//        System.out.println("================================");




    }
}
