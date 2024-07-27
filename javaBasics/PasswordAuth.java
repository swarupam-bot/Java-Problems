package com.practice.javaBasics;
import java.util.*;


public class PasswordAuth {

    public static  Boolean loginFunc(String str,int Pass)
    {
        Boolean auth=false;
        HashMap<String,Integer> LoginCred=new HashMap<>();
        LoginCred.put("swarupam",1234);
        LoginCred.put("rohit",1235);
        LoginCred.put("akash",2142);

        for(String str2: LoginCred.keySet())
        {
            if(LoginCred.get(str2).equals(Pass) && str2.equals(str))
            {
                auth=  true;
            }

        }
        return auth;

    }
    public static void main(String[] args) {

        System.out.println(loginFunc("swarupam",1234));


    }

}
