package Thread;
import java.util.*;
import java.util.Collection;
import java.util.Collections;
public class SynchronizedCol {
    public static void main(String[] args) {
        List stringList = new ArrayList<>(Arrays.asList("Java","Python","Js"));
        Collection synchronizedCollection = Collections.synchronizedCollection(stringList);
        System.out.println(synchronizedCollection);
    }
}
