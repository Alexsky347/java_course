package data_structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IteratorTest {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Get the iterator
        Iterator<String> iterator = list.iterator();

        // Print the list
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // works on
        // List, Set, Queue, Map
        // Iterator is an interface
        // hasNext(), next(), remove()
        // remove() is optional
        // remove() removes the last element returned by next()
        // remove() can be called only once per call to next()
        // remove() can't be called before next()
        // remove() can't be called after remove() or after add()
        Map<String, String> map = Map.of("A", "Apple", "B", "Banana", "C", "Cherry");
        Iterator<Map.Entry<String, String>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, String> entry = mapIterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //for of loop on list
        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(System.out::println);

        // for of loop on map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
