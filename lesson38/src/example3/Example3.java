package example3;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,40,50);

        Consumer<Integer> c = x -> System.out.println(x);
        Consumer<Integer> c_ = System.out::println;

        list.forEach(c);

        Map<Integer, String> m = Map.of(
                10,"A",
                20, "B",
                30,"C"
        );
        BiConsumer<Integer, String> c2 = (i,s) -> System.out.println(i+ " "+ s);
//        m.forEach((k,v) -> System.out.println(k + " " + v));
        m.forEach(c2);
    }
}
