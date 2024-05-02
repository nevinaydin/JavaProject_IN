package com.ideen.coreJavaReviewforBeginners;

import java.text.DecimalFormat;

public class printfMethod {
    public static void main(String[] args) {
        System.out.printf("This is an integer type %d%n", 10);
        System.out.printf("This is a double type %f%n", 10.5);
        System.out.printf("This is a string type %s%n", "hello");
        System.out.printf("This is a string type %S%n", "hello");

        System.out.printf("Value of pi is : %.2f%n" , Math.PI);
        System.out.printf("%-8s%n" , "Left");
        System.out.printf("%8s%n" , "Right");

        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(Math.PI));
    }
}
