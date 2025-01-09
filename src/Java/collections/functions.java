package Java.collections;

import java.util.*;

public class functions {
    public static void print(List l, String s) {
        System.out.println(s + " : " + l);
    }

    public static void List() {
        // ArrayList
        // ArrayLists --(Implements)--> List --(Extends)--> Collection
        //  (class)                   (Interface)           (Interface)

        // it provides dynamic arrays in java
        // it is slower than array, but we use it for different manipulation in array we needed
        // we don't need to mention the array size here
        // ArrayList can not be used for primitive types

        //Declaring the array list
        // with size n
        ArrayList<Integer> arr1 = new ArrayList<>(5);
        // without size
        ArrayList<Integer> arr2 = new ArrayList<>();
        List<String> arr3 = new ArrayList<>();

        //add() new elements
        arr1.add(55);
        arr1.add(557);
        arr3.add("85");
        arr2.add(0, 2);
        print(arr1, "arr1");
        print(arr2, "arr2");
        arr1.addAll(arr2);
        arr1.addAll(3, arr2);
        print(arr1, "arr1");
        //clear() the list
        arr2.clear();
        print(arr2, "arr2");
        //remove()
        arr1.remove(2);
        //arr1.remove("55");
        arr1.removeAll(arr2);
        print(arr1, "arr1");
        //size()
        System.out.println(arr1.size());
        //get()
        System.out.println(arr1.get(2));
        //indexOf()
        System.out.println(arr1.indexOf(557));

        //LinkedList
        // ease of insertions and deletions
        // LinkedList is implemented using the doubly linked list data structure

        // Declaring the LinkedList
        LinkedList<String> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(arr1);
        List<Integer> ll3 = new LinkedList<>();

        // add() new elements
        ll1.add("hello");
        ll2.add(3, 55);
        ll3.add(56);
        ll2.addAll(ll3);
        ll1.addFirst("first");
        ll1.addLast("last");
        print(ll1, "ll1");
        print(ll2, "ll2");
        print(ll3, "ll3");
        //clear()
        ll3.clear();
        print(ll3, "ll3");
        //other
        System.out.println("Contains() : " + ll2.contains(557));
        System.out.println("descendingIterator() : " + ll2.descendingIterator().next());
        System.out.println("element() : " + ll2.element()); // retrieves the first or head element
        System.out.println("get() : " + ll2.get(3));
        System.out.println("getFirst() : " + ll2.getFirst());
        System.out.println("getLast() : " + ll2.getLast());
        System.out.println("indexOf() : " + ll2.indexOf(55));
        System.out.println("lastIndexOf() : " + ll2.lastIndexOf(55));

    }

    public static void Queue() {
        // PriorityQueue --(Implements)--> Queue --(Extends)--> Collection
        //  (class)                      (Interface)            (Interface)
        // LinkedList --(Implements)--> Dequeue --(Extends)--> Queue
        //  (class)                   (Interface)            (Interface)

        //LinkedList
        Queue<String> qll1 = new LinkedList<>();
        qll1.add("first");
        qll1.add("queue");
        qll1.add("LinkedList");
        System.out.println("qll1 : " + qll1);
        // remove the front element
        System.out.println("remove() : " + qll1.remove());
        System.out.println("qll1 : " + qll1);
        //retrieves the front element
        System.out.println("peek() : " + qll1.peek());
        System.out.println("qll1 : " + qll1);
        //Size()
        System.out.println("size() : " + qll1.size());

        //PriorityQueue
        // order in ascending by default.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(7); // [7]
        //pq.add(1); // [1,7]
        pq.add(2); // [1,7,2]
        pq.add(5); // [1,7,2,5]
        pq.add(4); // [1,7,2,5,4]
        System.out.println("pq : " + pq);
        System.out.println("peek() : " + pq.peek()); // retrieves
        System.out.println("poll() : " + pq.poll()); // retrieves & remove
        System.out.println("pq : " + pq);
    }

    public static void Set() {
        // sets cannot contain duplicate elements.
        // we can create the objects from following these classes
        // HashSet, LinkedHashSet, EnumSet, TreeSet
        // SortedSet --(extends)--> Set
        // NavigableSet --(extends)--> Set

        // HashSet
        // capacity - it's size
        // loadFactor - if loadfactor is 0.6 then this set is filled by 60%,
        // the elements are moved to a new hash table of double the size of the original hash table.
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>(8, 0.75F); // by default capacity = 16, load factor = 0.75
        hs1.add(45);
        System.out.println(hs1.add(22));
        System.out.println(hs1.add(22));
        hs1.add(22);
        hs2.add(85);
        hs2.add(22);
        hs1.addAll(hs2); //union
        hs1.add(22);
        System.out.println("hs1 : " + hs1);
        System.out.println("hs2 : " + hs2);
//        hs1.remove(22);
//        hs1.removeAll(hs2); //difference
//        hs1.add(27);
//        System.out.println("hs1 : " + hs1);
//        System.out.println("hs2 : " + hs2);
//        hs1.retainAll(hs2); // intersection
//        System.out.println("hs1 : " + hs1);
//        System.out.println("hs2 : " + hs2);
    }

    public static void main(String[] args) {
        // List();
        Queue();
        Set();
    }
}
