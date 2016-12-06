package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class AoC6AMain {


    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        boolean isFirstPuzzle = false;

        String filename = "D:\\Personal Data\\mgoris\\Desktop\\AoC2016\\6a.txt";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";


        Scanner sc = null;
        try {
            sc = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();



        }
    }


}
