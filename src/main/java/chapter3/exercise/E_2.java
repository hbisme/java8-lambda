package chapter3.exercise;

import java.util.Arrays;

import common.StaticNumber;

public class E_2 {
    public static void main(String[] args) {
        long res = Arrays.stream(StaticNumber.getArtists1)
                .flatMap(artist -> artist.getNumbers().stream())
                .count();
        System.out.println(res);

    }
}
