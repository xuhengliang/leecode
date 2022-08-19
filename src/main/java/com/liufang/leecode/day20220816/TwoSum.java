package com.liufang.leecode.day20220816;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hengliang.xu@patpat.com
 * @decription
 * @date 2022-08-16-12-08
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)) {
                return new int[]{map.get(other),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
