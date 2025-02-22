package Java;

import java.util.*;
public class TreemapOperation2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> number = new TreeMap<>();
        number.put("0ne",2);
        number.put("Two", 5);
        number.put("Five",3);

        System.out.println(number.higherKey("Two"));    // key that is greater key than the given one
        System.out.println(number.higherEntry("Two"));// entry that is greater than the given key

        System.out.println(number.lowerKey("Two"));  // just lower key to the key that is given
        System.out.println(number.lowerEntry("Two")); // just lower entry to the key that is given

        System.out.println(number.ceilingKey("Three"));  // the key which is greater or equal to the given key
        System.out.println(number.ceilingEntry("Three"));

        System.out.println(number.floorKey("Three")); // the key which is smaller or equal to the given key
        System.out.println(number.floorEntry("Three"));
    }
}
