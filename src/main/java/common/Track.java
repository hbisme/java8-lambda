package common;

import com.alibaba.fastjson.JSON;

/**
 * 专辑中的一首歌曲
 * */
public class Track {

    // 歌曲的名称
    private String name;

    public Track() {

    }

    public Track(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
