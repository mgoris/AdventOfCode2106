package com.company;

/**
 * Created by mgoris on 3-12-2016.
 */
public class AoC1ADirection {
    private String orientation;
    private int steps;

    public AoC1ADirection(String orientation, int steps) {
        this.orientation = orientation;
        this.steps = steps;
    }

    public String orientation(){return orientation;}

    public int steps(){return steps;}
}
