package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTimeMeasure implements ListTimeMeasure {
    List<Integer> arrayList = new ArrayList<>();
    int numberOfOperations;

    public ArrayListTimeMeasure(int numberOfOperations){
        this.numberOfOperations = numberOfOperations;
    }

    public long addingMeasure(){
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long gettingMeasure(){
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            int element = arrayList.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long deletingMeasure(){
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.remove(0);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
