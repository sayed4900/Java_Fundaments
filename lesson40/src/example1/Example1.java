package example1;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = List.of("abcde","xyz","wnap");

        // java.util.function -> Function<T,R>
        // Function<T,T>  --> UnaryOperator
        // Function<T,Boolean> --> Predicate<T>

        var x =list.stream()
                .map(s -> s.length())
                .reduce(0, (a,b) -> a+b);

        System.out.println(x);
    }
}
