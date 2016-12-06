package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AoC4AMain {


    public static void main(String[] args) {
        boolean isFirstPuzzle = false;
        String filename = "D:\\Personal Data\\mgoris\\Desktop\\AoC2016\\4a.txt";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String doubleAlphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";


        Scanner sc = null;
        try {
            sc = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        int secretTotal = 0;
        while (sc.hasNextLine()) {
            String dirtyLine = sc.nextLine();
            int ind = dirtyLine.lastIndexOf("-");
            String lastHyphenToPipe = new StringBuilder(dirtyLine).replace(ind, ind + 1, "#").toString();
            String noHyphens = lastHyphenToPipe.replaceAll("-", "");
            String[] arr = noHyphens.split("\\[|]|#");
            char[] charArray = arr[0].toCharArray();
            if (isFirstPuzzle) {
                Arrays.sort(charArray);
                String sortedString = new String(charArray);

                String concatString = "";

                for (char ch : alphabet.toCharArray()) {
                    String chString = Character.toString(ch);
                    int count = sortedString.length() - sortedString.replaceAll(chString, "").length();
                    concatString += (count + ";" + chString + ",");
                }
                String[] concatArry = concatString.split(",");
                Arrays.sort(concatArry, Collections.reverseOrder());

                int previousInt = -1;
                String mainConstruction = "";
                String construction = "";
                for (String occurrence : concatArry) {
                    String[] occurrenceSplit = occurrence.split(";");
                    Integer occurrenceInt = Integer.parseInt(occurrenceSplit[0]);
                    String occurrenceString = occurrenceSplit[1];
                    if (occurrenceInt < previousInt) {
                        mainConstruction = mainConstruction + construction;
                        construction = "";
                    }
                    construction = occurrenceString + construction;
                    previousInt = occurrenceInt;
                    if (mainConstruction.length() > 4) {
                        break;
                    }
                }

                if (mainConstruction.substring(0, 5).equals(arr[2])) {
                    secretTotal += Integer.parseInt(arr[1]);
                }

                System.out.println(mainConstruction.substring(0, 5) + " " + arr[2] + " " + arr[1] + " " + secretTotal);
            }
            // not first puzzle
            else {
                int forwardRollNumber = (Integer.parseInt(arr[1]) % 26);
                for (char ch1 : charArray) {
                   System.out.print(doubleAlphabet.charAt(alphabet.indexOf(ch1) + forwardRollNumber));
                }
                System.out.print("   " + arr[1]);
                System.out.println("");


            }
        }


    }
}