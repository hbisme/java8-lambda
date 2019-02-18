package chapter4.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import common.Artist;
import common.StaticNumber;


interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();

    // public Stream<String> getAllMusicians();
}


class PerformanceImpl implements Performance {
    public PerformanceImpl() {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Stream<Artist> getMusicians() {
        Artist[] t1 = StaticNumber.getArtists1;
        return Arrays.stream(t1);
    }


    public Stream<String> getAllMusicians() {
        Stream<String> t = getMusicians().map(x -> {
            String artistName = x.getName();
            String numberNames = x.getNumbers().stream().collect(Collectors.joining(";"));
            return artistName + "-" + numberNames;
        });
        return t;
    }

}

public class E_1 {

    public static void main(String[] args) {
        PerformanceImpl p = new PerformanceImpl();
        p.getMusicians().forEach(x -> System.out.println(x));
        String numbers = p.getAllMusicians().collect(Collectors.joining("\n"));
        System.out.println(numbers);

    }
}
