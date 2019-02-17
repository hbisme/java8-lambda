package chapter3.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import common.Artist;
import common.StaticNumber;

public class E_1_b {
    public static List<String> getInfo(Artist[] artists){
        return Arrays.stream(artists)
                .map(artist -> artist.getName() + " from: " + artist.getOrigin())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getInfo(StaticNumber.getArtists1));

    }

}
