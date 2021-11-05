package com.jared.algorithmsimplementation.lecode;

import java.util.*;

public class ThreeSum_1 {
    public static void main(String[] args) {
        ThreeSum_1 threeSum = new ThreeSum_1();
        int[] nums = {3,0,-2,-1,1,2};
        ;
        System.out.printf(threeSum.threeSum(nums).toString());
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int length= nums.length;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            int index =  0 - num;
            for (int j = i; j < length; j++) {

            }



        }
        return null;
    }
}
