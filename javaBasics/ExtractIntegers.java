package com.practice.javaBasics;


public class ExtractIntegers {
    public static void main(String[] args) {
        String str = "1fSe45d3rD";

        StringBuilder integerStr = new StringBuilder();
        for (char c : str.toCharArray()) {

            if (Character.isDigit(c)) {
                integerStr.append(c);
            } else if (integerStr.length() > 0) {
                int number = Integer.parseInt(integerStr.toString());
                System.out.println(number);
                integerStr.setLength(0);
            }
        }
        if (integerStr.length() > 0) {
            int number = Integer.parseInt(integerStr.toString());
            System.out.println(number);
        }
    }
}

