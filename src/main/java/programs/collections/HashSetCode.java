package programs.collections;

import java.util.*;

public class HashSetCode {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println(set);

        System.out.println(set.size()); // Getting the size of the set
        System.out.println(set.contains("Banana")); // Checking if the set contains "Banana"
        System.out.println(set.isEmpty()); // Checking if the set is empty

        set.remove("Cherry"); // Removing "Cherry" from the set
        System.out.println(set);

        set.clear(); // Clearing the set
        System.out.println(set.isEmpty()); // Checking if the set is empty after clearing

    }
}

/*
 * HashSet is a collection that implements the Set interface and is backed by a
 * hash table.
 * It does not allow duplicate elements and does not guarantee any specific
 * order of elements.
 * The HashSet class provides constant time performance for basic operations
 * like add,
 * remove, contains, and size, assuming the hash function disperses the elements
 * properly among
 * the buckets.
 * 
 */