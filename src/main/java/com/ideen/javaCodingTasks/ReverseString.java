package com.ideen.javaCodingTasks;

public class ReverseString {
    /* Write a return method that can reverse  String
     Ex: Reverse("ABCD"); ==> DCBA*/
    public static void main(String[] args) {
        System.out.println(reverse1("abcd"));
        System.out.println(reverse2("abcd"));
    }

    public static String reverse1(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reverse += str.charAt(i);
        return reverse;
    }

    public static String reverse2(String str) {
        return new StringBuffer(str).reverse().toString();
    }

}
