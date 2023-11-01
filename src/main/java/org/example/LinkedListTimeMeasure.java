package org.example;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTimeMeasure implements ListTimeMeasure {
    List<Integer> linkedList = new LinkedList<>();
    int numberOfOperations;
    public LinkedListTimeMeasure(int numberOfOperations) {
        this.numberOfOperations = numberOfOperations;
    }

    public long addingMeasure(){
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long gettingMeasure() {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            int element = linkedList.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public long deletingMeasure() {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.remove(0);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
