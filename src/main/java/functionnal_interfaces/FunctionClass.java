package functionnal_interfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionClass {
    public static void main(String[] args) {
        List countries = List.of("USA", "India", "UK", "Canada");
        Consumer print = country -> System.out.println(country);
        countries.forEach(print);
        //Objects.requireNonNull(null);

        Function<Integer, Integer> square = (x) -> x * x;
        Function<Integer, Integer> add = (x) -> x + x;
        Integer rst = square.andThen(add).apply(50);
        System.out.println(rst);
    }



}
