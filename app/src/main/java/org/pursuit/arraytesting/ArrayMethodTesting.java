package org.pursuit.arraytesting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayMethodTesting {

    private static ArrayMethodTesting instance;

    public static ArrayMethodTesting getInstance() {
        if (instance == null) {
            instance = new ArrayMethodTesting();
        }
        return instance;
    }

    private ArrayMethodTesting() {

    }

    public boolean isLessThan10(String[] input) {

        return input.length < 10;
    }

    public String[] smallEvensOnly(String[] input) {

        if (input.length % 2 == 0) {
            for (int i = 0; i < input.length; i++) {
                int index = 0;
                int elementLength = input[0].length();
                if (input[i].length() > elementLength) {
                    index = i;
                    elementLength = input[i].length();
                    String[] arr = new String[]{input[index]};
                    return arr;
                }
            }
        }
        return input;
    }

    public char[] sortAlphabetically(char[] input) {

        Arrays.sort(input);

        return input;
    }

    public double returnSum(double[] input) {
        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        return Math.abs(sum);
    }

    public Set removeCaseSensitiveDuplicates(String[] input) {
        Set<String> duplicates = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            duplicates.add(input[i].toLowerCase());
        }

        return duplicates;
    }

    public Map mapDuplicates(String[] input) {
        Map<String, Integer> duplicates = new HashMap<>();
        Integer count;
        for (int i = 0; i < input.length; i++) {
            count = duplicates.get(input[i].toLowerCase());
            if (count == null) {
                count = 1;
            } else count++;
            duplicates.put(input[i], count);
        }
        return duplicates;
    }
}