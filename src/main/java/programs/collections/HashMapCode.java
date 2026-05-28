package programs.collections;

import java.util.*;

public class HashMapCode {

    public static void main(String[] args) {
        /*
         * HashMap is a data structure that stores key-value pairs. It allows for fast
         * retrieval of values based on their associated keys. HashMap does not maintain
         * any order of the elements.
         */

        // 1. Create HashMap
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        // 2. put(key, value) - Adding elements
        map.put("Avinash", 30);
        map.put("Mali", 25);
        map.put("TCS", 35);

        // 3. get(key) - Retrieving value
        System.out.println(map.get("Avinash"));

        // 4. remove(key) - Removing element
        map.remove("TCS");
        System.out.println(map);

        // 5. size() - Getting size
        System.out.println(map.size());

        // 6. containsKey(key) - Checking if key exists
        System.out.println(map.containsKey("Avinash"));

        // 7. containsValue(value) - Checking if value exists
        System.out.println(map.containsValue(30));

    }
}
