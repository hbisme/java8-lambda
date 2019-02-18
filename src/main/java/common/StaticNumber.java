package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticNumber<musician1> {

    /*-------乐队--------*/
    private static String person1 = "p1";
    private static String person2 = "p2";
    private static String person3 = "p3";
    private static List<String> numbers1 = Arrays.asList(person1, person2, person3);
    // 乐队1
    public static Artist artist1 = new Artist("甲壳虫乐队", numbers1, "hangzhou");

    private static String person4 = "p4";
    private static String person5 = "p5";
    private static String person6 = "p6";
    private static List<String> numbers2 = Arrays.asList(person4, person5, person6);
    // 乐队2
    public static Artist artist2 = new Artist("后街男孩乐队", numbers2, "shanghai");


    public static Artist[] getArtists1 = new Artist[]{artist1, artist2};

    /*------歌曲------*/
    public static Track track1 = new Track("track1");
    public static Track track2 = new Track("track2");
    public static Track track3 = new Track("track3");
    public static Track track4 = new Track("track4");
    public static Track track5 = new Track("track5");
    public static Track track6 = new Track("track6");
    public static Track track7 = new Track("track7");
    public static Track track8 = new Track("track8");


    /*---专辑------*/

    // 专辑里有的歌曲
    public static Track[] tracks1 = new Track[]{};
    public static Track[] tracks2 = new Track[]{track1, track2};
    public static Track[] tracks3 = new Track[]{track1, track2, track3};
    public static Track[] tracks4 = new Track[]{track2, track3, track4, track5, track6};

    // 创作专辑的艺术家们
    public static List<String> musician1 = Arrays.asList("user1", "user2");
    public static List<String> musician2 = Arrays.asList("user3", "user4");
    public static List<String> musician3 = Arrays.asList("user5", "user6");

    public static Album album1 = new Album("album1", tracks1, musician1);
    public static Album album2 = new Album("album2", tracks2, musician2);
    public static Album album3 = new Album("album3", tracks3, musician3);
    // 专辑列表
    public static List<Album> getAlbums1 = Arrays.asList(album1, album2, album3);

}
