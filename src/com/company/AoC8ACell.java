package com.company;

/**
 * Created by mgoris on 10-12-2016.
 */
public class AoC8ACell {
    private int x;
    private int y;
    private String content;

    public AoC8ACell(int x, int y, String content) {
        this.x = x;
        this.y = y;
        this.content = content;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
