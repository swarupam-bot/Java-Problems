package com.practice.javaBasics;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> Student=new HashMap<>();

        Student.put(1,"swarupam");
        Student.put(2,"Ram");
        Student.put(3,"rahul");

        for (int i:Student.keySet()){
            System.out.println(Student.get(i));

        }
    }
}
