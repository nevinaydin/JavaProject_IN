package com.ideen.javaCodingTasks;

public class ConsecutiveNumbers {


    /*
    Write a function that takes a positive integer N as input and prints the consecutive numbers from 1 to N, each on a separate line.
    However, if a number is divisible by 2, 3, or 5, it should be replaced by a specific word as follows:
    Numbers divisible by 2 should be replaced by 'Java'.
    Numbers divisible by 3 should be replaced by 'Selenium'.
    Numbers divisible by 5 should be replaced by 'Coders'.
    If a number is divisible by more than one of the numbers (2, 3, or 5), it should be replaced by a concatenation of the respective words in the following order: 'Java', 'Selenium', and 'Coders'.

    For example:
    Numbers divisible by both 2 and 3 should be replaced by 'JavaSelenium'.
    Numbers divisible by all three numbers (2, 3, and 5) should be replaced by 'JavaSeleniumCoders'.
    For example, here is the output for N = 24:
                                    1
                                    Java
                                    Selenium
                                    Java
                                    Coders
                                    JavaSelenium
                                    7
                                    Java
                                    Selenium
                                    JavaCoders
                                    11
                                    JavaSelenium
                                    13
                                    Java
                                    SeleniumCoders
                                    Java
                                    17

                                    ....
     */
    public static void main(String[] args) {
        printConsecutiveNumbers(15);
        int N = 30;
        printConsecutiveNumbers2(N);
    }

    private static void printConsecutiveNumbers(int N) {
        String result = "";
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0)
                result += "JavaSeleniumCoders\n";
            else if (i % 2 == 0 && i % 3 == 0)
                result += "JavaSelenium\n";
            else if (i % 2 == 0 && i % 5 == 0)
                result += "JavaCoders\n";
            else if (i % 3 == 0 && i % 5 == 0)
                result += "SeleniumCoders\n";
            else if (i % 2 == 0)
                result += "Java\n";
            else if (i % 5 == 0)
                result += "Coders\n";
            else if (i % 3 == 0)
                result += "Selenium\n";
            else
                result += i + "\n";
        }
        System.out.println(result);
    }

    public static void printConsecutiveNumbers2(int N) {
        for (int i = 1; i <= N; i++) {
            String output = "";
            if (i % 2 == 0) {
                output += "Java";
            }
            if (i % 3 == 0) {
                output += "Selenium";
            }
            if (i % 5 == 0) {
                output += "Coders";
            }
            if (output.equals("")) {
                output += i;
            }
            System.out.println(output);
        }
    }

}


