package Collection;

import java.util.*;
public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> langs = new LinkedList<>();
        langs.add("Thread");
        langs.add("Python");
        langs.add("Javascript");
        System.out.println(langs);

        String scr1 = langs.peek();
        System.out.println(scr1);

        String scr2 = langs.poll();
        System.out.println(scr2);

        langs.offer("C++");
        System.out.println(langs);
    }


}
