package Collection;

import java.util.*;
public class VectorsOperation {
    public static void main(String[] args) {
        Vector<String> mammals = new Vector<>(Arrays.asList("Dog","Cat"));

        mammals.add(2,"Cow");
        System.out.println(mammals);

        Collections.sort(mammals);
        System.out.println(mammals);

        Iterator<String> iterator = mammals.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<String> animals = new Vector<>(Arrays.asList("Crocodile"));
        animals.addAll(mammals);
        System.out.println(animals);

        System.out.println(animals.contains("Dog"));

    }
}
