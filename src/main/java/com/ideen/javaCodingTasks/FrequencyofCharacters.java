package com.ideen.javaCodingTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AABBCCC"));
        System.out.println(FrequencyOfChars2("AABBCCC"));
        frequencyofChars4("AAABBCDD");
    }

    public static String FrequencyOfChars(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++)
            if (!nonDup.contains("" + str.charAt(i)))
                nonDup += str.charAt(i);
        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j))
                    count++;
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }
        return expectedResult;
    }

    public static String FrequencyOfChars2(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }


    //solution 3
    public String frequencyOfChars3(String str) {
        String nonDup = "", result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += str.charAt(i);
            }
        }
        for (int i = 0; i < nonDup.length(); i++) {
            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
            result += "" + nonDup.charAt(i) + num;
        }

        return result;
    }

    public static void frequencyofChars4(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        // Printing the result in the desired format
        map.forEach((k, v) -> System.out.print("" + k + v));
    }
}


