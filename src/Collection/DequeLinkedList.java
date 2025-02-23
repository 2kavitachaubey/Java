package Collection;

import java.util.*;
public class DequeLinkedList {
    public static void main(String[] args) {
        Deque<Integer> numbers = new LinkedList<>(Arrays.asList(2,4,1,3));
        numbers.addFirst(5);
        numbers.addLast(6);
        System.out.println(numbers);

        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        numbers.removeFirst();
        System.out.println(numbers);

        numbers.removeLast();
        System.out.println(numbers);
    }

}
