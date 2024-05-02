package com.ideen.coreJavaReviewforBeginners;

public class RelationalOperatorsPractice {
    /*
    Relational Operators
	statements return a boolean value

        > greater than
        < less than
        >= greater than or equal to
        <= less than or equal to

        == equals
        != not equals

        Q: What is the difference between = and == ?

                in java we use = as an assignment operator
                in java we use == to compare two values, are they equal?
     */
    public static void main(String[] args) {
        if (7 > 6){
            System.out.println("Greater than operator practice");

        System.out.println("It is not related with if statement");
        }

        {
            System.out.println("something");
        }


        if (1 < 13) {
            System.out.println("Less than operator practice");
        }
        if (true) {
            System.out.println("Condition in if statement needs to be \"true\" to be executed");
        }
        if (false) {
            System.out.println("This statement in no ways can be executed");
        }
        if (!false) {
            System.out.println("\"!\" operator is to reverse the condition. It means \"not\"");
        }
        if (5 == 4 + 1) {
            System.out.println("\"==\" is equality operator");
        } else if (true) {
            System.out.println("Even though this is a true condition, it won't be executed.\nJava runs top to bottom and left to right.\nThe first condition that is true will be executed and the rest of the if statement won't");
        } else {
            System.out.println("This won't be executed");
        }

        System.out.println("******************************************************************");
        System.out.println("Even though this is a true condition, it won't be executed.\nJava runs top to bottom and left to right.\nThe first condition that is true will be executed and the rest of the \"if else/else if\" statements won't.");
        System.out.println("******************************************************************");


    }

}
