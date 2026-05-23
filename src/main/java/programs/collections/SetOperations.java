package programs.collections;

import java.util.*;

/**
 * Set operations
 * Demonstrates HashSet, LinkedHashSet, and TreeSet usage
 */
public class SetOperations {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 2, 8, 1, 9, 2, 5));

        System.out.println("HashSet (unordered, no duplicates): " + hashSet);

        Set<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet (sorted, no duplicates): " + treeSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(5, 2, 8, 1, 9));
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
    }
}
