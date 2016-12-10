package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AoC8AMain {


    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        boolean isFirstPuzzle = false;
        AoC8AGrid grid = new AoC8AGrid(50, 6);

        String filename = "src/com/company/resources/8a.txt";

        Scanner sc = null;
        try {
            sc = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.contains("rect")) {
                String[] breakup = line.split("x|\\ ");
                grid.createRectangleFromTopLeft(Integer.parseInt(breakup[1]), Integer.parseInt(breakup[2]));
            } else if (line.contains("row")) {
                String[] breakup = line.split("=|\\ by\\ ");
                grid.rotateRowRightBy(Integer.parseInt(breakup[1]), Integer.parseInt(breakup[2]));
            } else if (line.contains("column")) {
                String[] breakup = line.split("=|\\ by\\ ");
                grid.rotateColumnDownBy(Integer.parseInt(breakup[1]), Integer.parseInt(breakup[2]));
            }
            grid.print();
        }


//        AoC8AGrid grid = new AoC8AGrid(7,3);
//        grid.print();
//        grid.createRectangleFromTopLeft(3,2);
//        grid.print();
//        grid.rotateColumnDownBy(1,1);
//        grid.print();
//        grid.rotateRowRightBy(0,4);
//        grid.print();
//        grid.rotateColumnDownBy(1,1);
//        grid.print();

    }
}
