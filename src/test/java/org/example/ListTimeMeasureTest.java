package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTimeMeasureTest {
    ListTimeMeasure listTimeMeasure;

    void setUp(boolean flag) {
        if (flag) {
            listTimeMeasure = new ArrayListTimeMeasure(5000);
        } else {
            listTimeMeasure = new LinkedListTimeMeasure(5000);
        }
        listTimeMeasure.addingMeasure();
    }

    @Test
    void gettingMeasure() {
        setUp(true);
        long arrayTime = listTimeMeasure.gettingMeasure();
        setUp(false);
        long listTime = listTimeMeasure.gettingMeasure();
        assertTrue(listTime >= arrayTime);
    }

    @Test
    void deletingMeasure() {
        setUp(true);
        long arrayTime = listTimeMeasure.deletingMeasure();
        setUp(false);
        long listTime = listTimeMeasure.deletingMeasure();
        assertTrue(listTime <= arrayTime);
    }
}