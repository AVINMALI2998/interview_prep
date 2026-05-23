package programs.collections;

import java.util.*;

/**
 * List operations and manipulation
 * Demonstrates ArrayList and LinkedList usage patterns
 */
public class ListManipulation {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Adding elements
        for (int i = 1; i <= 5; i++) {
            list.add(i * 10);
        }

        System.out.println("Original List: " + list);

        // Sorting in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted (Descending): " + list);

        // Filtering elements
        List<Integer> filtered = new ArrayList<>();
        for (Integer num : list) {
            if (num > 20) {
                filtered.add(num);
            }
        }
        System.out.println("Filtered (> 20): " + filtered);
    }
}
