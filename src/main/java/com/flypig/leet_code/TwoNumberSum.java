package com.flypig.leet_code;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] result = new int[2];

        for(int i = 0, size = nums.length; i < size; i++){
            map.put(nums[i], i);
        }

        for(int i = 0, size = nums.length; i < size; i++){
            int num = target-nums[i];
            if(!map.containsKey(num)){
                continue;
            }

            if(i == map.get(num)){
                continue;
            }

            result[0] = i;
            result[1] = map.get(num);
            return result;
        }

        return null;
    }

    public static void main(String[] args){
        System.out.println("hello world");

        int []nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        if(result != null){
            System.out.println(result[0]+" "+result[1]);
        }
    }

}
