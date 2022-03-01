import java.util.*;

public class qnLinkedList {

    public static void main(String args[]) {

        java.util.LinkedList<Integer> list = new java.util.LinkedList<Integer>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        System.out.println("Initial list values: " + list);
        addAndSort(list, 0);
        System.out.println("Question 1: " + list);
        swapValues(list, 0, 5);
        System.out.println("Question 2: " + list);
        findValue(list, 4234);

    }

    private static void addAndSort(java.util.LinkedList<Integer> list, int value) {

        if (list.size() == 0) {
            list.add(value);
        } else if (list.get(0) > value) {
            list.add(0, value);
        } else if (list.get(list.size() - 1) < value) {
            list.add(list.size(), value);
        } else {
            int i = 0;

            while (list.get(i) < value) {
                i++;
            }
            list.add(i, value);
        }

    }

    private static void swapValues (java.util.LinkedList<Integer> list, int indexOne, int indexTwo) {

         int i1 = list.indexOf(indexOne);
         int i2 = list.indexOf(indexTwo);

         if (i1 == -1 || i2 == -1) {
             System.out.println("Node(s) not found, exiting...");
             return;
         }

         list.set(i1, indexTwo);
         list.set(i2, indexOne);

    }

    private static void findValue (java.util.LinkedList<Integer> list, int searchVal) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1000,9999));
        }

        if (list.contains(searchVal)) {
            System.out.println("Question 3: " + "\nPosition: " + list.indexOf(searchVal));
        }

        else {
            System.out.println("Question 3: -1");
        }

    }


}
