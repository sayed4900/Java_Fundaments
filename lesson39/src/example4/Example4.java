package example4;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,5,7,9);


        list.stream()
            .forEach(x -> m(x));

    }

    static void m(int x) throws Exception{
        if (x % 2 == 0){
            throw new RuntimeException("");
        }
        System.out.println(":)");
    }
}
