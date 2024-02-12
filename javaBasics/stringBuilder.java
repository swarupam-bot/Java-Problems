package com.practice.javaBasics;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Swarupam");

        System.out.println(sb.reverse());

        System.out.println(sb);
       // sb.reverse();
       // sb.insert(0,'N');
        //sb.delete(3,4);
       // sb.deleteCharAt(0);
        //sb.append(" k");
        sb.delete(0,sb.length());

        System.out.println(sb);

     /*   String name="swarupam";
        String revName="";

        for(int i=name.length()-1;i>=0;i--)
        {

          //  System.out.print(name.charAt(i));
            revName+=name.charAt(i);


        }
        System.out.println(revName);

        */

        String[] arr={"my","name","is","swarupam"};

       for (String Fintro:arr)
        {
            sb.append(Fintro);
            sb.append(" ");


        }
        System.out.println(sb);


    }
}
