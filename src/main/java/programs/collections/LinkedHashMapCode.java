package programs.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCode {

    public static void main(String[] args) {
        /*
         * LinkedHashMap is a data structure that stores key-value pairs. It maintains
         * the insertion order of the elements, meaning that when you iterate over the
         * entries, they will be returned in the order they were added. LinkedHashMap
         * provides fast retrieval of values based on their associated keys.
         */

        // 1. Create LinkedHashMap
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        // 2. put(key, value) - Adding elements
        map.put(30, "Avinash");
        map.put(25, "Mali");
        map.put(35, "TCS");

        // 3. get(key) - Retrieving value
        System.out.println(map.get(30));

        // 4. remove(key) - Removing element
        map.remove(35);
        System.out.println(map);

        // 5. size() - Getting size
        System.out.println(map.size());

        // 6. containsKey(key) - Checking if key exists
        System.out.println(map.containsKey(30));

        // 7. containsValue(value) - Checking if value exists
        System.out.println(map.containsValue("Avinash"));

        // 8. isEmpty() - Checking if map is empty
        System.out.println(map.isEmpty());

        // 9. keySet() - Getting all keys
        System.out.println(map.keySet());

        // 10. values() - Getting all values
        System.out.println(map.values());

        // 11. entrySet() - Getting all key-value pairs
        System.out.println(map.entrySet());

    }
}
