package org.example;
public class Main {
    public static void main(String[] args) {
        int numberOfOperations = 5000;
        ListTimeMeasure listTimeMeasure = new ArrayListTimeMeasure(numberOfOperations);

        long addArrayListTime = listTimeMeasure.addingMeasure();
        long getArrayListTime = listTimeMeasure.gettingMeasure();
        long deleteArrayListTime = listTimeMeasure.deletingMeasure();

        listTimeMeasure = new LinkedListTimeMeasure(numberOfOperations);
        long addLinkedListTime = listTimeMeasure.addingMeasure();
        long getLinkedListTime = listTimeMeasure.gettingMeasure();
        long deleteLinkedListTime = listTimeMeasure.deletingMeasure();

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
