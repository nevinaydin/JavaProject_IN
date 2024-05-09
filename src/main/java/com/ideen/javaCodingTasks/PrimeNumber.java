package com.ideen.javaCodingTasks;

public class PrimeNumber {
     /*
        Write a method that can check if a number is prime or not
     */
     public static void main(String[] args) {
         System.out.println(findPrimeNum(12));

     }

    public static boolean findPrimeNum(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
