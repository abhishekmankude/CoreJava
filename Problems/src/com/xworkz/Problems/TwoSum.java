package com.xworkz.Problems;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int target = 3;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

        public static int[] twoSum(int[] nums, int target) {
            int[] arr=new int[2];

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        arr[0]=i;
                        arr[1]=j;
                        break;


                    }
                }
            }
            return arr;
        }
    }


