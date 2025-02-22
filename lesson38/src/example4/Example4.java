package example4;

import java.util.Random;
import java.util.function.Supplier;

public class Example4 {
    public static void main(String[] args) {
        Random r = new Random();
        Supplier<Integer> s = () -> r.nextInt(500); // [0,499]

        Integer x = s.get();
        System.out.println(x);
    }
}
