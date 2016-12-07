package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
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
        String[] firstLetters = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        String[] secondLetters = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        String[] thirdLetters = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        String[] fourthLetters = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        String[] fifthLetters = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        String[] sixthLetters = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        int firstMaxNumber = 0;
        char firstMaxCharacter = '-';
        int secondMaxNumber = 0;
        char secondMaxCharacter = '-';
        int thirdMaxNumber = 0;
        char thirdMaxCharacter = '-';
        int fourthMaxNumber = 0;
        char fourthMaxCharacter = '-';
        int fifthMaxNumber = 0;
        char fifthMaxCharacter = '-';
        int sixthMaxNumber = 0;
        char sixthMaxCharacter = '-';
        int totalChars = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            for (int i = 0; i < line.length(); i++) {
                switch (i) {
                    case 0:
                        firstLetters[alphabet.indexOf(line.charAt(i))] += line.charAt(i);
                        totalChars += 1;
                        if (firstMaxNumber <= firstLetters[alphabet.indexOf(line.charAt(i))].length()) {
                            firstMaxNumber = firstLetters[alphabet.indexOf(line.charAt(i))].length();
                            firstMaxCharacter = line.charAt(i);

                        }
                        break;
                    case 1:
                        secondLetters[alphabet.indexOf(line.charAt(i))] += line.charAt(i);
                        totalChars += 1;
                        if (secondMaxNumber <= secondLetters[alphabet.indexOf(line.charAt(i))].length()) {
                            secondMaxNumber = secondLetters[alphabet.indexOf(line.charAt(i))].length();
                            secondMaxCharacter = line.charAt(i);

                        }
                        break;
                    case 2:
                        thirdLetters[alphabet.indexOf(line.charAt(i))] += line.charAt(i);
                        totalChars += 1;
                        if (thirdMaxNumber <= thirdLetters[alphabet.indexOf(line.charAt(i))].length()) {
                            thirdMaxNumber = thirdLetters[alphabet.indexOf(line.charAt(i))].length();
                            thirdMaxCharacter = line.charAt(i);

                        }
                        break;
                    case 3:
                        fourthLetters[alphabet.indexOf(line.charAt(i))] += line.charAt(i);
                        totalChars += 1;
                        if (fourthMaxNumber <= fourthLetters[alphabet.indexOf(line.charAt(i))].length()) {
                            fourthMaxNumber = fourthLetters[alphabet.indexOf(line.charAt(i))].length();
                            fourthMaxCharacter = line.charAt(i);

                        }
                        break;
                    case 4:
                        fifthLetters[alphabet.indexOf(line.charAt(i))] += line.charAt(i);
                        totalChars += 1;
                        if (fifthMaxNumber <= fifthLetters[alphabet.indexOf(line.charAt(i))].length()) {
                            fifthMaxNumber = fifthLetters[alphabet.indexOf(line.charAt(i))].length();
                            fifthMaxCharacter = line.charAt(i);

                        }
                        break;
                    case 5:
                        sixthLetters[alphabet.indexOf(line.charAt(i))] += line.charAt(i);
                        totalChars += 1;
                        if (sixthMaxNumber <= sixthLetters[alphabet.indexOf(line.charAt(i))].length()) {
                            sixthMaxNumber = sixthLetters[alphabet.indexOf(line.charAt(i))].length();
                            sixthMaxCharacter = line.charAt(i);

                        }
                        break;
                }
            }
        }
        for (int k = 0; k < 26; k++) {
            System.out.print(firstLetters[k].length() + firstLetters[k] + " ");
            System.out.print(secondLetters[k].length() + secondLetters[k] + " ");
            System.out.print(thirdLetters[k].length() + thirdLetters[k] + " ");
            System.out.print(fourthLetters[k].length() + fourthLetters[k] + " ");
            System.out.print(fifthLetters[k].length() + fifthLetters[k] + " ");
            System.out.print(sixthLetters[k].length() + sixthLetters[k] + " ");
            System.out.println("");
        }
        System.out.println("   " + firstMaxCharacter);
        System.out.println("   " + secondMaxCharacter);
        System.out.println("   " + thirdMaxCharacter);
        System.out.println("   " + fourthMaxCharacter);
        System.out.println("   " + fifthMaxCharacter);
        System.out.println("   " + sixthMaxCharacter);
        System.out.println("  total chars: " + totalChars);
    }
}
