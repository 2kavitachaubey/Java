package Java;

import java.util.*;
public class HashpmapOperation {
    public static void main(String[] args) {
        HashMap<String, Integer> elements = new HashMap<>();
        elements.put("Hello", 2);
        elements.put("hii", 7);
        elements.put("hey", 5);

        System.out.println(elements);

        //Access
        System.out.println(elements.get("hii"));

        //Replace
        System.out.println(elements.replace("Hello", 4));
        System.out.println(elements);

        //Removed
        System.out.println(elements.remove("hey"));
        System.out.println(elements);


    }
}
