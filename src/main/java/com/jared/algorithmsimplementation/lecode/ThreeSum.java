package com.jared.algorithmsimplementation.lecode;

import java.util.*;
/**
 *
 *  三数之和暴力解法
 * @Author shouxu
 * @Date 2021/9/14 18:02
 */
public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {3,0,-2,-1,1,2};
        ;
        System.out.printf(threeSum.threeSum(nums).toString());
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<String> hashSet = new HashSet<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length ; j++) {
                for (int k = j + 1; k < length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer>  integerList = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(integerList);
                        System.out.println(integerList);
                        if(hashSet.add(integerList.toString())){
                            list.add(integerList);
                        }
                    }
                    System.out.println(Arrays.asList(i,j,k)+"----"+ Arrays.asList(nums[i],nums[j],nums[k]));
                }
            }
        }
        return list;
    }
}
