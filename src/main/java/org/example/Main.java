package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int numberOfOperations = 1000; // Change this to the desired number of operations

        // Create ArrayList and LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Measure the time for adding elements to ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long addArrayListTime = endTime - startTime;

        // Measure the time for adding elements to LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long addLinkedListTime = endTime - startTime;


        // Measure the time for getting elements from ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            int element = arrayList.get(i);
        }
        endTime = System.nanoTime();
        long getArrayListTime = endTime - startTime;

        // Measure the time for getting elements from LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            int element = linkedList.get(i);
        }
        endTime = System.nanoTime();
        long getLinkedListTime = endTime - startTime;

        // Measure the time for deleting elements from ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        long deleteArrayListTime = endTime - startTime;

        // Measure the time for deleting elements from LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        long deleteLinkedListTime = endTime - startTime;

        // Display the results in a table
        System.out.println("Method\t\t\tOperations\tTime (ns)");
        System.out.println("---------------------------------------------------");
        System.out.println("Add ArrayList\t" + numberOfOperations + "\t\t" + addArrayListTime);
        System.out.println("Add LinkedList\t" + numberOfOperations + "\t\t" + addLinkedListTime);
        System.out.println("Delete ArrayList\t" + numberOfOperations + "\t\t" + deleteArrayListTime);
        System.out.println("Delete LinkedList\t" + numberOfOperations + "\t\t" + deleteLinkedListTime);
        System.out.println("Get ArrayList\t" + numberOfOperations + "\t\t" + getArrayListTime);
        System.out.println("Get LinkedList\t" + numberOfOperations + "\t\t" + getLinkedListTime);
    }
}
