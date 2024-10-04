package functionnal_interfaces;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamClass {
    static private final List<String> veggies = List.of("Carrot", "Potato", "Tomato", "Onion");

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Arrays.stream(numbers).parallel().forEach(System.out::println);
        Arrays.stream(numbers).forEach(System.out::println);
//        filterOn();
//        mapOn();
//        reduceOn();
//        countOn();
//        anyMatchOn();
//        allMatchOn();
//        noneMatchOn();
//        findFirstOn();
        collectionUtils();
        multiOperationDemo();
    }

    static void collectionUtils() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<String> veggiesRst = veggies.stream().filter(v -> v.contains("s")).collect(Collectors.toList());
        System.out.println("rst: " + veggiesRst);

        List<Integer> numbersRst = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        System.out.println(Collections.max(numbersRst));
    }

    static void multiOperationDemo(){
        veggies.stream()
                .sorted()
                .filter(veggie -> veggie.startsWith("P"))
                .map(String::toUpperCase)
                .map(veggie -> veggie.transform(w -> "yummi "+ w))
                .forEach(System.out::println);
    }

    static void filterOn() {
        veggies.stream().filter(veggie -> veggie.startsWith("P")).forEach(System.out::println);
    }

    static void mapOn() {
        veggies.stream().map(veggie -> veggie.toUpperCase()).forEach(System.out::println);
    }

    static void reduceOn() {
        String result = veggies.stream().reduce("", (partialString, element) -> partialString + element);
        System.out.println(result);
    }

    static void countOn() {
        long count = veggies.stream().count();
        System.out.println(count);
    }

    static void anyMatchOn() {
        boolean result = veggies.stream().anyMatch(veggie -> veggie.startsWith("P"));
        System.out.println(result);
    }

    static void allMatchOn() {
        boolean result = veggies.stream().allMatch(veggie -> veggie.startsWith("P"));
        System.out.println(result);
    }

    static void noneMatchOn() {
        boolean result = veggies.stream().noneMatch(veggie -> veggie.startsWith("P"));
        System.out.println(result);
    }

    static void findFirstOn() {
        String result = veggies.stream().findFirst().get();
        System.out.println(result);
    }
}
