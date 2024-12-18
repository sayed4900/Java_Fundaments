package example9;

import java.util.function.UnaryOperator;

public class Example9 {
    public static void main(String[] args) {
        UnaryOperator<Integer> u = n -> n+1;

        int res = u.apply(11) ;
        System.out.println(res);

        UnaryOperator<String> u2 = n-> new StringBuilder(n)
                .reverse().toString();

        System.out.println(u2.apply("HELLO"));

    }
}
