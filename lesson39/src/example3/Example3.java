package example3;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,5,7,9);

        boolean b1 = list.stream().anyMatch(x -> x%2 == 0 ) ; // false
        boolean b2 = list.stream().allMatch(x -> x%2 == 0 ) ; // false
        boolean b3 = list.stream().noneMatch(x -> x%2 == 0 ) ; // true

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
