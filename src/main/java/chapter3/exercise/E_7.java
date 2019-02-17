package chapter3.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E_7 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "bb", "ccc", "DDDDD");
        List<String> list2 = Arrays.asList();

        Optional<String> r1 = list1.stream().max(Comparator.comparing(str -> {
            IntStream chars = str.chars();
            long count = chars.filter(c -> c >= 97 & c <= 122).count();
            return count;
        }));

        System.out.println(r1);


        Optional<String> r2 = list2.stream().max(Comparator.comparing(str -> {
            IntStream chars = str.chars();
            long count = chars.filter(c -> c >= 97 & c <= 122).count();
            return count;
        }));
        System.out.println(r2);


    }
}
