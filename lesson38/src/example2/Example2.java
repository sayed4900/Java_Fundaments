package example2;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example2 {
    public static void main(String[] args) {
        // Consumer
        // BiConsumer
        // Supplier
        // Function
        // BiFunction
        // Predicate
        // BiPredicate
        // UnaryOperator
        // BinaryOperator

        Consumer<String> c1 =  s -> System.out.println(s);
        Consumer<String> c2 = System.out::println;

        c2.accept("Hello!");

        BiConsumer<Integer,String> c3 = (a,b)-> System.out.println(a+b);

        c3.accept(10 ," Toot");
    }
}
