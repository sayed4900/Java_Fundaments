package example10;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Example10 {
    public static void main(String[] args) {
        BinaryOperator<Integer> b1 = (a,b) -> a + b;

        int res = b1.apply(11,12);
        System.out.println(res);

        BinaryOperator<Integer> maxInteger = BinaryOperator.maxBy(Comparator.naturalOrder());
        int max = maxInteger.apply(10, 20); // max will be 20

        // Example 2: Finding the minimum string length using minBy
        BinaryOperator<String> minStringLength = BinaryOperator.minBy(Comparator.comparingInt(String::length));
        String shortest = minStringLength.apply("hello", "ali"); // shortest will be "hello"

        System.out.println("Maximum Integer: " + max);
        System.out.println("Shortest String: " + shortest);
    }
}
