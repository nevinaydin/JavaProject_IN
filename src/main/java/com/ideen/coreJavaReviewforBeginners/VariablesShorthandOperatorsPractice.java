package com.ideen.coreJavaReviewforBeginners;

public class VariablesShorthandOperatorsPractice {
    public static void main(String[] args) {
        int a = 2;
        int b = 23;
        int c = 5;
        a += b * c; //   a=a+b*c
        b %= c - 1 - 1;
        c *= a - b; //c=5*(117-2)
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
