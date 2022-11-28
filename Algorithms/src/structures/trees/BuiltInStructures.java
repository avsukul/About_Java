package data_structure.trees;

import java.util.*;

public class BuiltInStructures {

    public static void main(String[] args) {
        priorityQueue();
    }

    static void array() {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 7;
        System.out.println(Arrays.toString(arr));

    }

    static void vector() {
        // Vector class is deprecated since Java 5.
        Vector<Integer> vector = new Vector<>();
        vector.add(8);
        vector.add(80);
        vector.add(3);
        System.out.println(vector);
    }

    static void stack() {
        Stack<Integer> stack = new Stack<>();  // LIFO
        stack.add(8);
        stack.add(80);
        stack.add(3);
        System.out.println(stack);
        stack.pop();
        stack.push(7);
        System.out.println(stack);
    }

    static void linkList() {
        LinkedList<Integer> list = new LinkedList<>(); // FIFO
        list.add(50);
        list.offer(0);
        list.addFirst(100);
        list.addLast(1);
        list.add(50);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.poll());
        System.out.println(list.getLast());
    }

    static void queueLinkList() {
        Queue<Integer> queue = new LinkedList<>(); // FIFO
        queue.add(5);
        queue.add(50);
        queue.add(1);
        System.out.println(queue);

    }

    static void dequeLinkList() {
        Deque<Integer> deque = new LinkedList<>(); // FIFO or LIFO
        deque.add(5);
        deque.add(50);
        deque.add(1);
        System.out.println(deque);
    }

    static void list() {
        List<Integer> list = new LinkedList<>(); // FIFO or LIFO
        list.add(50);
        list.add(1);
        list.add(0, 7);
        System.out.println(list);
    }

    static void dictionaryHashTable() {
        // Synchronized // no null accepted
        Dictionary<String, Integer> dictionary = new Hashtable<>();
        dictionary.put("key", 1);
        dictionary.put("key2", 2);
        System.out.println(dictionary);
    }

    static void hashMap() {
        // NOT Synchronized // null accepted
        Map<String, Integer> map = new HashMap<>();
        map.put("key", 1);
        map.put("key2", 2);
        map.put("key3", null);
        System.out.println(map);
    }

    static void treeMap() {
        // Keeps insertion order // NOT Synchronized
        Map<String, Integer> map = new TreeMap<>();
        map.put("key2", 2);
        map.put("key", 1);
        map.put("key3", null);
        System.out.println(map);
    }

    static void linkedHashMap() {
        // Keeps insertion order // NOT synchronized
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("key", 1);
        map.put("key2", 2);
        map.put("key3", null);
        System.out.println(map);
    }

    static void set() {
        Set<String> set = new HashSet<>();
        set.add("8");
        set.add("u");
        set.add("u");
        set.add("0");
        set.add(null);
        System.out.println(set);
    }

    static void treeSet() {
        // null NOT permitted // NOT Synchronized
        Set<String> set = new TreeSet<>();
        set.add("8");
        set.add("9");
        set.add("ufd");
        set.add("ugdfas");
        set.add("ufd");
        set.add("0");
        System.out.println(set);
    }

    static void queuePriorityQueue() {
        // null NOT permitted // FIFO
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(55);
        queue.add(9);
        queue.offer(10);
        System.out.println(queue);
        queue.remove(); // removes top element
        System.out.println(queue.poll());   // retrieves and removes
        System.out.println(queue);
        System.out.println(queue);
    }

    static void priorityQueue() {
        // null NOT permitted // FIFO
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(55);
        queue.add(9);
        queue.offer(10);
        System.out.println(queue);
        queue.remove(); // removes top element
        System.out.println(queue.poll());   // retrieves and removes
        System.out.println(queue);
        int i = queue.peek();
        System.out.println(i);
    }
}