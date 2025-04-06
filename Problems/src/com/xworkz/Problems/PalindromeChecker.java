package com.xworkz.Problems;

public class PalindromeChecker {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        System.out.println(pc.isPalindrome("A man, a plan, a canal:???? Panama"));
        System.out.println(pc.isPalindrome("race a car"));
        System.out.println(pc.isPalindrome(" "));
    }
}
