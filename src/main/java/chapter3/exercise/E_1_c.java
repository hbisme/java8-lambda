package chapter3.exercise;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import common.Album;
import common.StaticNumber;

public class E_1_c {
    public static Set<Album> getinfo(List<Album> albums){
        return albums.stream().filter(album -> album.getTracks().length <3).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(getinfo(StaticNumber.getAlbums1));
    }
}
