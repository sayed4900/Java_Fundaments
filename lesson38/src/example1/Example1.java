package example1;

public class Example1 {
    public static void main(String[] args) {

        Eatable e1 = new Eatable() {
            @Override
            public void eat() {
                System.out.println("eat");
            }
        };

        Eatable e2 = () -> System.out.println("eat");
    }
}
