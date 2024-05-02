package com.ideen.coreJavaReviewforBeginners;

public class PrimitivesPractice {
    public static void main(String[] args) {
        long a =3_000L;
        double b= a;
        System.out.println(b);
        int c=(short)b;
        System.out.println(c);
        System.out.println(c%1000);
        System.out.println("-------------------------------------------------------------------");
        long aa=30l;
        short bb=(short) aa;
        System.out.println(bb);
        System.out.println("-------------------------------------------------------------------");
        float aaa= 100.459_524f;
        byte bbb= (byte) aaa;
        System.out.println(bbb);
        double ccc = bbb;
        System.out.println(ccc);
        System.out.println((double)(7)/2); //7.00/2 ==>3.5
        System.out.println((double)(7/2));//(double)(3)==>3.0
        System.out.println((int)((7.8)+(double)(15)/2));//7.8+7.5==>15.3==>15
    }
}
