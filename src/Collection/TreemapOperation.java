package Collection;

import java.util.*;
public class TreemapOperation {
    public static void main(String[] args) {
        TreeMap<String, Integer> oddNumber = new TreeMap<>();

        //Put
        oddNumber.put("One",1);
        oddNumber.put("Five", 5);
        System.out.println(oddNumber);

        //PutIfAbsent
        oddNumber.putIfAbsent("Three", 3);
        System.out.println(oddNumber);

        //PutAll
        TreeMap<String, Integer> num = new TreeMap<>();
        num.put("Seven",7);
        System.out.println(num);

        num.putAll(oddNumber);
        System.out.println(num);

        System.out.println("Entry set are in square bracket: " + num.entrySet());
        System.out.println("KeySet are in square bracket: "+ num.keySet());
        System.out.println("Values are in square bracket: "+ num.values());

        //get and getOrDefault
        System.out.println(num.get("One"));
        System.out.println(num.getOrDefault("NineNineNine",999));

        //remove and remove with key and value
        System.out.println(num.remove("Five"));
        System.out.println("Is the number remove: "+ num.remove("Nine", 9));

        System.out.println(num.firstKey());
        System.out.println(num.firstEntry());
        System.out.println(num.lastKey());
        System.out.println(num.lastEntry());

    }
}
