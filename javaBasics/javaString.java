package com.practice.javaBasics;

public class javaString {
    public static void main(String[] args) {
        String name="Swarupam";


        StringBuffer str=new StringBuffer(name);
        str.reverse();

        System.out.println(str.reverse());


        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("w"));

        System.out.println(name.charAt(2));
        char letter='a';
        char newChar='r';
        String modifiedName="";
        for(int i=0;i<name.length();i++){
            char currentChar=name.charAt(i);
            if(currentChar==letter){
                modifiedName+=newChar;
            }
            else {
                modifiedName+=currentChar;
            }
        }
        System.out.println(modifiedName);

        //Reverse a String

        String RevString="";

        for (int k=name.length();k>0;k--)
        {
            RevString+= name.charAt(k-1);

        }
        System.out.println(RevString+" rev string");

        char[] charArray=name.toCharArray();

        for (int i=1;i<charArray.length;i++)
        {
            if(charArray[i]==letter)
            {
                charArray[i]=newChar;
            }
        }

        String NewModifiedName=new String(charArray);
        System.out.println(NewModifiedName);

        String [] WeekDays={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

        System.out.println(WeekDays[2]);
        int j=WeekDays.length;
       for(int i=0;i<j;j--){
           System.out.println(WeekDays[j-1]);
       }



        int b = 12345;
        String numberAsString = Integer.toString(b);
        int length = numberAsString.length();

        System.out.println("The length of the integer is: " + length);




    }
}
