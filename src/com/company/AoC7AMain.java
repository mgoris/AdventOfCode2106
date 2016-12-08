package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AoC7AMain {


    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        boolean isFirstPuzzle = false;
        int supportsTLSCount = 0;
        int supportsSSLCount = 0;

        String filename = "src/com/company/resources/7a.txt";

        Scanner sc = null;
        try {
            sc = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();


        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            AoC7AIpV7 ipv7 = new AoC7AIpV7(line);
            if (isFirstPuzzle) {
                if (ipv7.supportsTLS()) {
                    supportsTLSCount += 1;
                    System.out.print("Yes!  ");
                } else {
                    System.out.print("No..  ");
                }
                System.out.print(line);
                System.out.println("");
                System.out.println(supportsTLSCount);
            } else {
                if (ipv7.supportsSSL()) {
                    supportsSSLCount += 1;
                    System.out.print("Yes!  ");
                } else {
                    System.out.print("No..  ");
                }
                System.out.print(line);
                System.out.println("");
                System.out.println(supportsSSLCount);
            }
        }


    }
}


