package org.example.generalTips;

//public class GeneralTodos {
//}
// Java Program to Traverse through HashMap
// Using Iterator

// Importing required classes
import java.util.*;

// Main class
class GeneralTodos {

    // Main driver method
    public static void main(String[] args)
    {

        HashMap<String, Integer> hm
                = new HashMap<String, Integer>();

        hm.put("GeeksforGeeks", 54);
        hm.put("A computer portal", 80);
        hm.put("For geeks", 82);

        // Printing all elements of HashMap
        System.out.println("\n"+"Created hashmap is" + hm);

        // Getting an iterator
        Iterator hmIterator = hm.entrySet().iterator();


        System.out.println("\n"+
                "---------Traversing hashmap using iterator---------");


        System.out.println(
                "HashMap after adding bonus marks:");

        // Iterating through Hashmap and
        // adding some bonus marks for every student
        while (hmIterator.hasNext()) {

            Map.Entry mapElement
                    = (Map.Entry)hmIterator.next();
            int marks = ((int)mapElement.getValue() + 10);

            // Printing mark corresponding to string entries
            System.out.println(mapElement.getKey() + " : "
                    + marks);
        }


        System.out.println("\n"+"---------Traversing hashmap using for-each---------");


        for (Map.Entry<String,Integer> mapElement : hm.entrySet()) {
            String key = mapElement.getKey();

            int value = (mapElement.getValue() + 10);

            System.out.println(key + " : " + value);
        }


        System.out.println("\n"+"---------Traversing hashmap using forEach---------");

        // Looping through HashMap and adding bonus marks
        // using HashMap.forEach()
        hm.forEach((k, v)
                -> System.out.println(k + " : "
                + (v + 10)));
    }
}
