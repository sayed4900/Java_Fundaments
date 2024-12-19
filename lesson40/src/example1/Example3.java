package example1;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> list = List.of("abc","xyz","dsa");

        // Stream
        // map()  Stream -> Stream
        // mapToInt() Stream -> IntStream
        // mapToDouble() Stream -> DoubleStream
        // mapToLong() Stream -> LongStream

        var x =list.stream()
            .mapToInt(s -> s.length()) // transfer Stream object to IntStream object
              .sum();
        System.out.println(x);

//        var y =list.stream()
//                .mapToInt(s -> s.length()) // transfer Stream object to IntStream object
//                .mapToObj(s->s) // transfer IntStream to Stream
//                .sum(); // Stream Object don't have sum function
    }
}
