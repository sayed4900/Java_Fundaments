package example1;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,6,7,2,3);

        for(Integer i : list){
            if (i%2 == 0)
                System.out.println(i);
        }

        list.stream()
                .filter(x -> x%2==0)
                .forEach(System.out::println);

    }
}
