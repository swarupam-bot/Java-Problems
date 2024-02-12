package com.practice.javaBasics;

public class javaIncapulation {

    private String name;
    public String getName(){

        return name;
    }
    public String setName()
    {

        return name ="swarupam";
    }

    public static void main(String[] args) {
        javaIncapulation skn=new javaIncapulation();

        skn.setName();
        String myName=skn.getName();
        System.out.println(myName);

    }
}
