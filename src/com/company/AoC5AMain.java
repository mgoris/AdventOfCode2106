package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.*;
import java.security.*;

public class AoC5AMain {


    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        boolean isFirstPuzzle = false;


        String doorID = "cxdnnyjw";
        String DoorIDPlusIndex = "";
        String password = "";
        String position0 = "";
        String position1 = "";
        String position2 = "";
        String position3 = "";
        String position4 = "";
        String position5 = "";
        String position6 = "";
        String position7 = "";
        int position0_done = 0;
        int position1_done = 0;
        int position2_done = 0;
        int position3_done = 0;
        int position4_done = 0;
        int position5_done = 0;
        int position6_done = 0;
        int position7_done = 0;
        for (int index = 0; index < 2113231930; index++) {
            DoorIDPlusIndex = doorID + index;
            byte[] bytesOfMessage = DoorIDPlusIndex.getBytes("UTF-8");


            MessageDigest md = null;
            md = MessageDigest.getInstance("MD5");
            byte[] thedigest = md.digest(bytesOfMessage);
            String hexString = toHex(thedigest);

            if ((hexString.charAt(0) == '0') && (hexString.charAt(1) == '0') && (hexString.charAt(2) == '0') && (hexString.charAt(3) == '0') && (hexString.charAt(4) == '0')) {
                System.out.print(hexString);
                System.out.print(" 6th character:   ");
                System.out.print(hexString.charAt(5));
                System.out.print("   7th character: ");
                System.out.print(hexString.charAt(6));
                System.out.print(" index: ");
                System.out.print(index);
                System.out.println("");
                password = password + hexString.charAt(5);


                if ((position0_done * position1_done * position2_done * position3_done * position4_done * position5_done * position6_done * position7_done) == 0) {

                    if ("01234567".contains(Character.toString(hexString.charAt(5)))) {
                        switch (hexString.charAt(5)) {
                            case '0':
                                if (position0_done == 0){
                                position0 = Character.toString(hexString.charAt(6));
                                position0_done = 1;}
                                break;
                            case '1':
                                if (position1_done == 0){
                                position1 = Character.toString(hexString.charAt(6));
                                position1_done = 1;}
                                break;
                            case '2':
                                if (position2_done == 0){
                                position2 = Character.toString(hexString.charAt(6));
                                position2_done = 1;}
                                break;
                            case '3':
                                if (position3_done == 0){
                                position3 = Character.toString(hexString.charAt(6));
                                position3_done = 1;}
                                break;
                            case '4':
                                if (position4_done == 0){
                                position4 = Character.toString(hexString.charAt(6));
                                position4_done = 1;}
                                break;
                            case '5':
                                if (position5_done == 0){
                                position5 = Character.toString(hexString.charAt(6));
                                position5_done = 1;}
                                break;
                            case '6':
                                if (position6_done == 0){
                                position6 = Character.toString(hexString.charAt(6));
                                position6_done = 1;}
                                break;
                            case '7':
                                if (position7_done == 0){
                                position7 = Character.toString(hexString.charAt(6));
                                position7_done = 1;}
                                break;
                        }
                        System.out.println(" " + position0_done + position1_done + position2_done + position3_done + position4_done + position5_done + position6_done + position7_done);
                    }


                }
                else {
                    System.out.println(position0 + position1 + position2 + position3 + position4 + position5 + position6 + position7);
                    break;}
            }

        }
    }

    public static String toHex(byte[] bytes) {
        BigInteger bi = new BigInteger(1, bytes);
        return String.format("%0" + (bytes.length << 1) + "X", bi);
    }

}