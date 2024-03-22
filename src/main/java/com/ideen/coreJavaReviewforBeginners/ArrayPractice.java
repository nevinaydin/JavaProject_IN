package com.ideen.coreJavaReviewforBeginners;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        //declare an int array
        int[] numbers;
        numbers = new int[6];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(numbers);// hashcode
        System.out.println("this is how we print array's element) = " + Arrays.toString(numbers));


        System.out.println(numbers[2]);

        // System.out.println(numbers[7]);//ArrayIndexOutOfBoundsException

        int numberOfTheElement = numbers.length;
        System.out.println(numberOfTheElement);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == 2) {
                break;
            }
            System.out.println(numbers[i] + " ");
        }

        //declare 3 int arrays at the same line
        int[] numbers1, numbers2, numbers3;
        numbers1 = new int[2];
        numbers2 = new int[2];
        numbers3 = new int[3];

        int numbers4[], numbers5, numbers6;
        numbers4 = new int[5];
        numbers5 = 4;

        Object[] objArray = new Object[5];
        objArray[0] = 1;
        objArray[1] = "hello";
        objArray[2] = 3.4;

        System.out.println("Arrays.toString(objArray) = " + Arrays.toString(objArray));

        int[] numbers7 = {11, 22, 1, 55, 123};
        Arrays.sort(numbers7);
        System.out.println("Arrays.toString(numbers7) = " + Arrays.toString(numbers7));

        String str = "ideen@info.com@123232#$#$$^$";
        String[] strNew = str.split("");

        System.out.println("Splitted String as String Array = " + Arrays.toString(strNew));

        System.out.println("String to char array = " + Arrays.toString(str.toCharArray()));

        System.out.println("Arrays.toString(str.split(\"@\")) = " + Arrays.toString(str.split("@")));


        String str2 = str.split("@")[1];
        System.out.println(str2);

        Boolean value = str2 == "cydeo.com";
        System.out.println(value);

        char str3 = str.split("@")[1].toUpperCase().charAt(2);
        System.out.println(str3);

        int[] arr = Arrays.copyOf(numbers, 6);

        System.out.println(Arrays.equals(numbers, arr));


    }
}
