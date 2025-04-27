package Revision;
import  java.util.*;

public class CollectionRevised {

//    // Array list
//    public void arrayList(){
//        ArrayList<Integer> myArr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        myArr.add(3);
//        myArr.add(10);
//        System.out.println(myArr);
//
//        myArr.remove(4);
//        System.out.println(myArr);
//
//        System.out.println(myArr.size());
//
//        System.out.println(myArr.contains(9));
//
//        myArr.set(3,9);
//        System.out.println(myArr);
//
//        for(int i =0;i< myArr.size(); i++){
//            System.out.println(myArr.get(i));
//        }
//
//        Iterator<Integer> iterator = myArr.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        ArrayList<Integer> newNumber = new ArrayList<>(Arrays.asList(4,7));
//        newNumber.addAll(myArr);
//        System.out.println(newNumber);
//
//        newNumber.removeAll(myArr);
//        System.out.println(newNumber);
//
//        Collections.sort(myArr);
//        System.out.println(myArr);
//    }
//
//    // Vectors
//    public void vector(){
//        Vector<String> myVec = new Vector<>(Arrays.asList("john","lisa","Katty"));
//        myVec.add("Rosie");
//        myVec.add("Jennie");
//        System.out.println(myVec);
//
//        myVec.remove(1);
//        System.out.println(myVec);
//
//        System.out.println(myVec.size());
//
//        System.out.println(myVec.contains("lisa"));
//
//        myVec.set(3,"V");
//        System.out.println(myVec);
//
//        for(int i =0;i< myVec.size(); i++){
//            System.out.println(myVec.get(i));
//        }
//
//        Iterator<String> iterator = myVec.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        Vector<String> newString = new Vector<>(Arrays.asList("Taylor","Selena"));
//        newString.addAll(myVec);
//        System.out.println(newString);
//
//        newString.removeAll(myVec);
//        System.out.println(newString);
//
//        Collections.sort(myVec);
//        System.out.println(myVec);
//    }

    //linked list
    public void linked(){
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,5,7,3,24));
        ll.add(2);
        ll.add(1);
        ll.addFirst(0);

        ll.add(2,8);
        System.out.println(ll);

        System.out.println(ll.indexOf(1));
        System.out.println(ll.lastIndexOf(1));
    }

    public void queue(){
        Queue<Integer> ll = new LinkedList<>(Arrays.asList(1,5,7,3,24));
        ll.add(2);
        ll.add(1);
        ll.offer(0);

        System.out.println(ll);
        System.out.println(ll.remove());

        Queue<Integer> ql = new LinkedList<>(Arrays.asList(5,6));
        System.out.println(ql.peek());
        System.out.println(ql.poll());
        System.out.println(ql);
    }

    //Tree Map
    public void tree(){
        TreeMap<Integer,String> value = new TreeMap<>();
        // Insertion
        value.put(1,"One");
        value.put(2,"Two");
        value.putIfAbsent(4,"Four");

        // Access
        System.out.println(value.keySet());
        System.out.println(value.entrySet());
        System.out.println(value.values());
        System.out.println(value.get(2));
        System.out.println(value.getOrDefault(3,"Three"));

        //Remove
        System.out.println(value.remove(4));
        System.out.println(value.remove(2,"Two"));

        value.put(5,"Five");
        value.put(7,"Seven");

        // first , last
        System.out.println(value.firstKey());
        System.out.println(value.firstEntry());
        System.out.println(value.lastKey());
        System.out.println(value.lastEntry());

        value.put(10,"Ten");
        value.put(0,"Zero");

        System.out.println(value);
        //heigher
        System.out.println(value.higherKey(2));
        System.out.println(value.higherEntry(2));

        //lower
        System.out.println(value.lowerKey(2));
        System.out.println(value.lowerEntry(2));

        // ceiling
        System.out.println(value.ceilingKey(2));
        System.out.println(value.ceilingEntry(2));

        //floor
        System.out.println(value.floorKey(2));
        System.out.println(value.floorEntry(2));

    }

    public void hash(){
        HashMap<Integer,String> value = new HashMap<>();
        // Insertion
        value.put(1,"One");
        value.put(2,"Two");
        value.putIfAbsent(4,"Four");

        // Access
        System.out.println(value.get(2));
        System.out.println(value.getOrDefault(3,"Three"));

        //Remove
        System.out.println(value.remove(4));
        System.out.println(value.remove(2,"Two"));

        value.put(5,"Five");
        value.put(7,"Seven");

        System.out.println(value);

        value.replace(5,"Paach");
        System.out.println(value);
    }
    public static void main(String[] args) {
        CollectionRevised cr = new CollectionRevised();
//        cr.arrayList();
//        cr.vector();
        cr.linked();
        cr.queue();
        cr.tree();
        cr.hash();
    }
}
