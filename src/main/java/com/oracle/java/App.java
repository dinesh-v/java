package com.oracle.java;

import java.util.*;

/**
 * Data Structures
 */
public class App {
    public static void main(String[] args) {
        System.out.println("List of Data Structures");

        /* 1. Primitive Data Type */
        int i = 10;
        long l = 50;
        short sh = 4;
        byte by = 'x';
        float f = 20.0f;
        boolean b = false;
        String s = "Character sequence";
        char c = 'a';

        Integer integer = new Integer(4);

        /* 2. Composite Data Structure / Non primitive Data Type */
        int[] array = new int[5];
        int[] intArray = new int[]{4, 5, 6, 3};
        Arrays.stream(intArray).forEach(System.out::println);


        /* 3. Abstract Data Type */

        /* 3.1 List */
        List arrayList = new ArrayList();
        arrayList.add(new Integer(1));
        arrayList.add(new Float(5.5));
        arrayList.add(new String("Dinesh"));
        arrayList.add(new Character('a'));
        System.out.println(arrayList.size());
        arrayList.forEach(player -> System.out.println(player));

        List genericArrayList = new ArrayList<String>();

        genericArrayList.add("Test");
        genericArrayList.add("What?");
        genericArrayList.forEach(System.out::println);

        List<String> linkedList = new LinkedList<String>();


        /* 3.2 Stack */
        Stack<String> stack = new Stack<String>();

        /* 3.3 Queue */
    }
}
