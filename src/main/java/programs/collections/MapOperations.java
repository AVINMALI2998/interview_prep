package programs.collections;

import java.util.*;

/**
 * HashMap operations and patterns
 * Demonstrates common HashMap usage scenarios
 */
public class MapOperations {

    public static void displayMap(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static void main(String[] args) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = { "apple", "banana", "apple", "orange", "banana", "apple" };

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        displayMap(frequencyMap);
    }
}
