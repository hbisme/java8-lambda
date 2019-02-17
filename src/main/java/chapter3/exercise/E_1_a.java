package chapter3.exercise;

import java.util.Arrays;
import java.util.stream.Stream;

public class E_1_a {

    public static  Integer addup(Stream<Integer> numbers){
        return  numbers.reduce((x,y) -> x+y).get();
    }

    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1, 2, 3 ).stream();
        System.out.println(addup(stream));
    }
}
