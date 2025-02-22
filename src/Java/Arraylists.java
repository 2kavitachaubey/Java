package Java;

import java.util.*;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Lexus");
        cars.add(1,"Tata");
        System.out.println(cars);

        cars.set(3,"Mercedes");
        System.out.println(cars);

        System.out.println(cars.size());

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        for(int i = 0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println();

        for(String car: cars){
            System.out.println(car);
        }

        cars.remove(1);
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);


        // lists
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,56,42,232,2,34,21,45));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
