package com.practice.LeetCodeSolutions;

public class vailedParanthesisCheker {
    public static char ReturnParn(String str)
    {
        char [] paranStart={'{','(','['};
        char [] paranEnd={'}',')',']'};

        char ch=' ';

        for(int i=0;i<paranStart.length;i++)
        {
            if(str.contains(Character.toString(paranStart[i])))
            {
                ch= paranEnd[i];
            }
            if(str.contains(Character.toString(paranEnd[i])))
            {
                ch=paranStart[i];
            }
        }

        return ch;


    }

    public static void main(String[] args) {

        String str = "[]()()";

        Boolean value = true;

        char[] chrArr = str.toCharArray();

        for (int i = 0; i <= chrArr.length - 1; i += 2) {
            if (chrArr[i + 1] != ReturnParn(String.valueOf(chrArr[i]))) {
                value = false;
                break;
            }

        }
        System.out.println(value);


    }
    }
