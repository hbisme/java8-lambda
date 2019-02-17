package chapter3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class Test1 {
    public static void main(String[] args) {


        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream()).collect(toList());
        System.out.println(together);

        Optional<Integer> t1 = Stream.of(1, 2, 3).reduce((x, y) -> x + y);
        System.out.println(t1.get());

        Integer t2 = Stream.of(1, 2, 3).reduce(10, (x, y) -> x + y);
        System.out.println(t2);


        Optional<String> t3 = Optional.of("a");
        System.out.println(t3.get());

        Optional<Object> t4 = Optional.empty();
        System.out.println(t4);

        Optional<Object> emptyOptional = Optional.ofNullable(null);
        System.out.println(emptyOptional);

        Optional<Object> t6 = Optional.ofNullable("b");
        System.out.println(t6);

        // null 不能使用Optional.of包装,只能使用Optional.ofNullable包装
        // Optional<Object> t7 = Optional.of(null);

        System.out.println(emptyOptional.isPresent());
        System.out.println(t6.isPresent());

        System.out.println(emptyOptional.orElse("c"));
        System.out.println(emptyOptional.orElseGet(() -> {
            long t = System.currentTimeMillis();
            return String.valueOf(t + 100);
        }));


    }
}
