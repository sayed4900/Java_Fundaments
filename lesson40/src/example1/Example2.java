package example1;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = List.of("abc","xyz","dsa");

        // java.util.function -> Function<T,R>
        // Function<T,T>  --> UnaryOperator
        // Function<T,Boolean> --> Predicate<T>

      list.stream()
            .map(s -> new StringBuilder(s).reverse().toString())
            .forEach(System.out::println);



    }
}
