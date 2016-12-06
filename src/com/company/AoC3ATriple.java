package com.company;

public class AoC3ATriple {
    private int x;
    private int y;
    private int z;

    public AoC3ATriple(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean impossibleTriange() {
        if ((x + y) <= z) {
            return true;
        }
        if ((x + z) <= y) {
            return true;
        }
        if ((z + y) <= x) {
            return true;
        }
        return false;
    }

    public void print(){
        System.out.println("(" + x + "," + y + "," + z + ")" + " is impossible: " + impossibleTriange());
    }

    public int x(){return x;}
    public int y(){return y;}
    public int z(){return z;}
}
