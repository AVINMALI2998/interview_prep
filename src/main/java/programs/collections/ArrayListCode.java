package programs.collections;

import java.util.*;

public class ArrayListCode {

    /*
     * ArrayList is a resizable array that allows storing elements dynamically and
     * provides fast access using
     * indexes.
     */
    public static void main(String[] args) {

        // 1. Create ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // 2. add() - Adding elements
        list.add("Avinash");
        list.add("Mali");
        list.add("TCS");
        list.add("Pune");
        System.out.println(list);

        // 3. add(index, element)

        list.add(4, "Capgemini");
        System.out.println(list);

        // 4. get(index) - Access element

        System.out.println(list.get(0));

        // 5. set(index, element) - Replace element

        list.set(0, "Ankush");
        System.out.println(list);

        // 7. remove(object)
        list.remove("TCS");
        System.out.println(list);
        // 8. size()
        System.out.println(list.size()); // get size of collection
        // 9. contains()
        System.out.println(list.contains("Avinash"));
        // 10. indexOf()
        System.out.println(list.indexOf("Mali"));
        // 11. isEmpty()
        System.out.println(list.isEmpty());

    }

}