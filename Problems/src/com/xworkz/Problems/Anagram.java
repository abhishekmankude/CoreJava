package com.xworkz.Problems;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("jam","maj"));
    }


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths are different, they can't be anagrams
        }

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2); // Compare sorted arrays
    }

}

