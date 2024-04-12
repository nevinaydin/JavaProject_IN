package com.ideen.coreJavaReviewforBeginners;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> color_list;


        color_list = new ArrayList<> ();

        // use add() method to add values in the list
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Black");
        color_list.add("White");
        color_list.add("Yellow");
        color_list.add("White");

        System.out.println("List of Colors");
        System.out.println(color_list);

        // Replace all colors with White color
        Collections.replaceAll(color_list, "Black", "White");

        System.out.println("Color list, after replacing all Black with White color :");
        System.out.println(color_list);

        System.out.println("======================================================================");
        // create an empty array list
        ArrayList<String> color_list1 = new ArrayList<String>();

        // use add() method to add values in the list
        color_list1.add("White");
        color_list1.add("Black");
        color_list1.add("Red");

        // create an empty array sample with an initial capacity
        ArrayList<String> sample = new ArrayList<String>();

        // use add() method to add values in the list
        sample.add("Green");
        sample.add("Red");
        sample.add("White");

        // remove all elements from second list if it exists in first list
        sample.removeAll(color_list1);

        System.out.println("First List :" + color_list1);
        System.out.println("Second List :" + sample);

        System.out.println("==================================================================");
        // create an empty array list with an initial capacity
        ArrayList<String> color_list2 = new ArrayList<>();

        // use add() method to add values in the list
        color_list2.add("White");
        color_list2.add("Black");
        color_list2.add("Red");
        color_list2.add("White");

        // Print out the colors in the ArrayList
        System.out.println("****Color list****");
        System.out.println(color_list2);

        // create an empty array sample with an initial capacity
        ArrayList<String> sample1 = new ArrayList<String>(3);
        sample.add("Yellow");
        sample.add("Red");
        sample.add("White");

        // Now add sample with color_list
        color_list2.addAll(sample1);

        //New size of the list
        System.out.println("New size of the list is: " + color_list2.size());

        // Print out the colors


        System.out.println(color_list2);
        System.out.println("===========================================================");
        // create an empty array list
        ArrayList<String> color_list3 = new ArrayList<String>();

        // use add() method to add values in the list
        color_list3.add("White");
        color_list3.add("Black");
        color_list3.add("Red");

        // create an empty array sample with an initial capacity
        ArrayList<String> sample3 = new ArrayList<String>();

        // use add() method to add values in the list
        sample3.add("Green");
        sample3.add("Red");
        sample3.add("White");

        System.out.println("First List :" + color_list3);
        System.out.println("Second List :" + sample3);

        sample.retainAll(color_list3);

        System.out.println("After applying the method, First List :" + color_list3);
        System.out.println("After applying the method, Second List :" + sample3);
        System.out.println();


    }
}