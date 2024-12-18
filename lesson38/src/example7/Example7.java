package example7;

import java.util.Random;
import java.util.function.Predicate;

public class Example7 {
    public static void main(String[] args) {
        Random r = new Random();
        Predicate<Integer> p1 = x-> x % 2 == 0;

        boolean res = p1.test(r.nextInt(10));
        System.out.println(res);
    }
}
