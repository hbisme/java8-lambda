package chapter3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test6 {
    public static void main(String[] args) {
        String str = "abcDHGI";

        IntStream s = str.chars();
        s.filter(x -> x>96).forEach(x -> System.out.println((char)x));

    }
}
