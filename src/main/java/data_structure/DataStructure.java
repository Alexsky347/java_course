package data_structure;

import java.util.*;

public class DataStructure {
    public static void main(String[] args) {
        //unique collection unordered
        System.out.println("--- Set ---");
        Set fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        //set to string
        System.out.println(String.format("Fruits set data: %s", fruits));
        System.out.println("contains apple: " + fruits.contains("Apple"));
        fruits.remove("Apple");
        System.out.println(String.format("Fruits set data: %s", fruits));
        System.out.println(fruits.size());

        //immutable set
        // cant add or remove
        Set moreFruits = Set.of("Pear", "Grapes", "Pineapple");
        System.out.println(String.format("More fruits set data: %s", moreFruits));
        System.out.println("------------------------------------------------------");

        //ordered collection
        System.out.println("--- List ---");
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple");
        list.set(1, "Mango");
        System.out.println(String.format("List data: %s", list));
        System.out.println("contains apple: " + list.contains("Apple"));
        list.remove(list.size() - 1);
        System.out.println(String.format("List data: %s", list));
        System.out.println("Index of Mango: " + list.indexOf("Mango"));
        System.out.println("Last index of Mango: " + list.lastIndexOf("Mango"));
        System.out.println("Get index 1: " + list.get(1));
        System.out.println(list.size());

        //immutable list
        List moreFruitsList = List.of("Pear", "Grapes", "Pineapple");
        System.out.println(String.format("More fruits list data: %s", moreFruitsList));
        //moreFruitsList.add("Kiwi");

        System.out.println("------------------------------------------------------");

        //ordered
        System.out.println("--- Queue ---");
        Queue  queue = new LinkedList<>();
        System.out.println("Queue is empty: " + queue.isEmpty());
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        queue.add("Apple");
       var removedOne =  fruits.remove("Apple");
        System.out.println("Removed: " + removedOne);
        System.out.println(String.format("Queue data: %s", queue));
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Peek: " + queue.peek()); //head of the queue
        queue.element();

        System.out.println("-------------------------------------------------------");

        //unordered key value pair
        System.out.println("--- Map ---");
        Map map = new HashMap();
        map.put("Apple", 1.99);
        map.put("Banana", 0.99);
        map.put("Orange", 1.49);
        map.put("Apple", 2.99);
        map.putIfAbsent("Lemon", 0.79);
        map.put("Kiwi", "3.99");
        System.out.println(String.format("Map data: %s", map));

        //immutable map
        Map moreFruitsMap = Map.of("Pear", 1.99, "Grapes", 2.99, "Pineapple", 3.99);
        System.out.println(String.format("More fruits map data: %s", moreFruitsMap));
    }
}
