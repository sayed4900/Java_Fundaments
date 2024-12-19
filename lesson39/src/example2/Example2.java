package example2;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        Stream <Integer> s1 = Stream.empty();

        Stream <Integer> s2 = Stream.of(3,7,8,9);
        s2.forEach(System.out::println);

        Supplier<Integer> sup = () -> new Random().nextInt(); // infinite
        Stream<Integer> s3 = Stream.generate(sup);

        s3.limit(10).forEach(System.out::println);


        Stream<Integer> s4 = Stream.iterate(1, i-> i+1); // infinite

        s4.limit(10).forEach(System.out::println);

        Stream<Integer> s5 = Stream.iterate(1,
                i-> i<= 10,
                i -> i+1); // finite



        s5.forEach(System.out::println);
    }
}
