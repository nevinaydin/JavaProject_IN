package com.ideen.javaCodingTasks;

public class PrintJAVA {
/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "JA" instead of the number and for numbers which are a
multiple of 5, print "VA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "JAVA" instead of the number.
*/
    public static void main(String[] args) {
        printJAVA(30);
    }

    private static void printJAVA(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) { //iterate from 1 to 30
            if (i % 15 == 0 ) //multiple of both 3 and 5, print "JAVA" instead of the number.
                result += "JAVA ";
            else if (i % 5 == 0) //multiple of 5, print "VA" instead of the number.
                result += "VA ";
            else if (i % 3 == 0)
                result += "JA ";  //multiple of 3, print "JA" instead of the number.
            else
                result += i + " ";
        }
        System.out.println(result);
    }


}
