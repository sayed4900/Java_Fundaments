package example8;

import java.util.function.BiPredicate;

public class Example8 {
    public static void main(String[] args) {
        BiPredicate<String,Integer> p = (s,i) -> s.length()==i;

        boolean test = p.test("hello",5); // true
        boolean test2 = p.test("hello",6); // false

        System.out.println(test + " " + test2);
    }
}
