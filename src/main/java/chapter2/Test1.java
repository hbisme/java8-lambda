package chapter2;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test1 {
    public static void main(String[] args) {

        final String name = "hb";
        Runnable t1 = () -> System.out.println("hello lambda " + name);
        t1.run();

        // t2 = String name2 -> System.out.println(name2);

        Predicate<String> t3 = name2 -> name2.equals("hb");
        t3.test("hb");

        Predicate<Integer> t4 = x -> x > 5;
        System.out.println(t4.test(6));

        BinaryOperator<Long> t5 = (x, y) -> x +y;
        System.out.println(t5.apply(1L, 2L));


    }
}
