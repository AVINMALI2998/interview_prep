package programs.collections;

import java.util.*;

public class LinkedListCode {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);

        list.addFirst("Mango"); // Adding element at the beginning
        System.out.println(list);

        list.addLast("Grapes"); // Adding element at the end
        System.out.println(list);

        list.removeFirst(); // Removing the first element
        System.out.println(list);

        list.removeLast(); // Removing the last element
        System.out.println(list);

        System.out.println(list.get(1)); // Accessing element at index 1

        list.set(1, "Blueberry"); // Replacing element at index 1
        System.out.println(list);

        System.out.println(list.size()); // Getting the size of the list

        System.out.println(list.contains("Banana")); // Checking if the list contains "Banana"

        System.out.println(list.indexOf("Cherry")); // Getting the index of "Cherry"

        System.out.println(list.isEmpty()); // Checking if the list is empty

    }
}

/*
 * LinkedList is a doubly linked list implementation of the List and Deque
 * interfaces. It allows for efficient insertion and removal of elements at both
 * ends of the list.
 */