package common;

import java.util.List;

/**
 * 乐队
 */
public class Artist {

    // 乐队名字(例如: "甲壳虫乐队")
    private String name;

    // 乐队成员(例如: "约翰", "杰克"),可以为空
    private List<String> numbers;

    // 乐队来自哪里(例如: "利物浦")
    private String origin;

    public Artist() {

    }

    public Artist(String name, List<String> numbers, String origin) {
        this.name = name;
        this.numbers = numbers;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
