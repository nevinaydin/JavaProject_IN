package com.ideen.coreJavaReviewforBeginners;

public class VariablesOperatorsPractice {
    public static void main(String[] args) {

        int x = 5;
        int y = x;
        x = 10;


        System.out.println("x = " + x);//10
        System.out.println("y = " + y);//5
        System.out.println(x + y);//15
        System.out.println(10+5);//15
        System.out.println(++x + 3 + 4 * 2 + 12 / 3 + x++ + x); //37, x=12
        //                 11  +....................+11     12)
        System.out.println(x);//12
        System.out.println(--x + 3 + 4 * 2 + 12 / 3 + x-- + x);//
        //                  11+11+4+11                          x=10

        boolean a=true;
        System.out.println(!a);
    }
}
