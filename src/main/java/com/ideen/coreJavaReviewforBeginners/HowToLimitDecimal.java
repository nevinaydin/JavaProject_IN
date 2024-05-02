package com.ideen.coreJavaReviewforBeginners;

import java.text.DecimalFormat;

public class HowToLimitDecimal {
    public static void main(String[] args) {
        int radius= 5;
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area: "+ area);
        //How to limit decimal
        //First Approach Type Casting

        double perimDouble= 2 * pi * radius;

        float perimeter = (float) (2 * pi * radius);
        System.out.println("Perimeter Without Type Casting " + perimDouble);

        System.out.println("Perimeter With Type Casting " + perimeter);

        //Second Approach
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(perimeter));

        //Third Approach printf method
        System.out.printf("%.2f",perimeter);
        System.out.println();

        //Forth Approach String Formatter
        System.out.println(String.format("%.2f",perimeter));

    }
}
