package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mgoris on 8-12-2016.
 */
public class AoC7AIpV7 {
    private String input;
    private List<String> allSequences = new ArrayList<String>();
    private List<String> hypernetSequences = new ArrayList<String>();
    private List<String> normalSequences = new ArrayList<String>();

    public AoC7AIpV7(String line) {
        this.input = line;
        prepareInput();
    }

    private void prepareInput() {
        // No input string begins nor ends with a hypernetSequence
        // No adjacent hypernetSequences exist either
        allSequences = Arrays.asList(input.split("\\[|\\]"));
        int counter = -1;
        for (String sequence : allSequences) {
            counter += 1;
            if (counter % 2 == 0) {
                normalSequences.add(sequence);
            } else {
                hypernetSequences.add(sequence);
            }
        }
    }

    private static boolean hasABBA(List<String> sequenceList) {
        for (String sequence : sequenceList) {
            if (isABBA(sequence)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isABBA(String sequence) {
        for (int i = 0; i < (sequence.length() - 3); i++) {
            if ((sequence.charAt(i) == sequence.charAt(i + 3)) && (sequence.charAt(i + 1) == sequence.charAt(i + 2)) && (sequence.charAt(i) != sequence.charAt(i + 1))) {
                return true;
            }
        }
        return false;
    }

    private static List<String> abaSequences(List<String> sequences) {
        List<String> abaSequences = new ArrayList<String>();
        for (String sequence : sequences) {
            for (int i = 0; i < (sequence.length() - 2); i++) {
                if ((sequence.charAt(i) == sequence.charAt(i + 2)) && (sequence.charAt(i) != sequence.charAt(i + 1))) {
                    abaSequences.add(sequence.substring(i+0, i+2));
                }
            }
        }
        return abaSequences;
    }


    public boolean supportsTLS() {
        boolean hasHypernetABBA = hasABBA(hypernetSequences);
        boolean hasNormalABBA = hasABBA(normalSequences);
        System.out.print(" hyper: " + hasHypernetABBA + " normal: " + hasNormalABBA + "  ");
        return (!(hasABBA(hypernetSequences)) && hasABBA(normalSequences));
    }

    public boolean supportsSSL() {
        List<String> abaSequences = new ArrayList<String>();

        abaSequences = abaSequences(normalSequences);
        if (abaSequences.size() > 0) {
            if (containsInvertedSequence(hypernetSequences, abaSequences)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsInvertedSequence(List<String> sequences, List<String> abaSequences) {
        for (String abaSequence : abaSequences) {
            String invertedABA = "" + abaSequence.charAt(1) + abaSequence.charAt(0) + abaSequence.charAt(1);
            for (String sequence : sequences) {
                if (sequence.contains(invertedABA)) {
                    return true;
                }
            }
        }
        return false;
    }
}
