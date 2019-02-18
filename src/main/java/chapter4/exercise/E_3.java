package chapter4.exercise;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import common.Artist;
import common.StaticNumber;

class Artists {
    private List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {

        if(index <0 || index >= artists.size()) {
            // indexException(index);
            return Optional.ofNullable(null);
        }

        return Optional.of(artists.get(index));
    }

    private void indexException(int index ){
        throw new IllegalArgumentException(index + "doesn't correspond to an Artist ");
    }

    public String getArtistName(int index) {
            Optional<Artist> artist = getArtist(index);

            if(artist.isPresent()) {
                return artist.get().getName();
            }else {
                return "unKnow";
            }
    }

}

public class E_3 {
    public static void main(String[] args) {

        List<Artist> a = Arrays.asList(StaticNumber.getArtists1);
        Artists artists = new Artists(a);
        String res = artists.getArtistName(1);
        System.out.println(res);
    }
}
