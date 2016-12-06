package com.company;

import java.util.List;

public class AoC2ACoordinate {
    private int x;
    private int y;
    static boolean verbosePrint = false;


    public AoC2ACoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public void moveOneStep(char direction, List<String> allowedCoordinates) {
        String newStringCoordinate = "";
        switch (direction) {
            case 'R':
                newStringCoordinate = ((x + 1) + "," + y);
                if (verbosePrint) {
                    System.out.print("Current coordinate: ");
                    System.out.print(x + "," + y + " ");
                    System.out.print("Determined coordinate for operation " + direction + " : ");
                    System.out.print(newStringCoordinate);
                }
                if (allowedCoordinates.contains(newStringCoordinate)) {
                    x += 1;
                }
                break;
            case 'L':
                newStringCoordinate = ((x - 1) + "," + y);
                if (verbosePrint) {
                    System.out.print("Current coordinate: ");
                    System.out.print(x + "," + y + " ");
                    System.out.print("Determined coordinate for operation " + direction + " : ");
                    System.out.print(newStringCoordinate);
                }
                if (allowedCoordinates.contains(newStringCoordinate)) {
                    x += -1;
                }
                break;
            case 'U':
                newStringCoordinate = (x + "," + (y + 1));
                if (verbosePrint) {
                    System.out.print("Current coordinate: ");
                    System.out.print(x + "," + y + " ");
                    System.out.print("Determined coordinate for operation " + direction + " : ");
                    System.out.print(newStringCoordinate);
                }
                if (allowedCoordinates.contains(newStringCoordinate)) {
                    y += 1;
                }
                break;
            case 'D':
                newStringCoordinate = (x + "," + (y - 1));
                if (verbosePrint) {
                    System.out.print("Current coordinate: ");
                    System.out.print(x + "," + y + " ");
                    System.out.print("Determined coordinate for operation     " + direction + " : ");
                    System.out.print(newStringCoordinate);
                }
                if (allowedCoordinates.contains(newStringCoordinate)) {
                    y += -1;
                }
                break;
        }
    }

    public void print(){
        System.out.print(x);
        System.out.print(",");
        System.out.print(y);
        System.out.println();
    }

    public void printStep(char direction){
        System.out.print("    ");
        System.out.print(direction);
        System.out.print(" : ");
        System.out.print(x);
        System.out.print(",");
        System.out.print(y);
        System.out.println();
    }

}
