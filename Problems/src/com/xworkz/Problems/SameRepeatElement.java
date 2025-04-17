package com.xworkz.Problems;

public class SameRepeatElement {
     public static void main(String[] args) {
                String str = "abacabad";
                char[] arr = str.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    int count = 0;
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            count++;
                        }
                        if (count == 2) {
                            System.out.println(arr[j]);
                            return;
                        }
                    }
                }
            }
        }
