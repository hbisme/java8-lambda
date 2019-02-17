package common;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * 专辑, 由若干曲目组成
 */
public class Album {

    // 专辑名称(例如: "左轮手枪歌曲集")
    private String name;

    // 专辑上所有歌曲的列表
    private Track[] tracks;

    // 参与创作专辑的艺术家列表
    private List<String> musicians;

    public Album(String name, Track[] tracks, List<String> musicians) {
        this.name = name;
        this.tracks = tracks;
        this.musicians = musicians;
    }

    public Album() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Track[] getTracks() {
        return tracks;
    }

    public void setTracks(Track[] tracks) {
        this.tracks = tracks;
    }

    public List<String> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<String> musicians) {
        this.musicians = musicians;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);

    }
}
