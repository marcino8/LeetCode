package src.java.main.problems;
//https://leetcode.com/problems/two-sum/
//better then 99.82% runtime and 87.90% memory

import java.util.*;

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){ // O(n) * O(1) -> O(n)
            if(valueIndexMap.containsKey(nums[i])){
                return new int[]{i, valueIndexMap.get(nums[i])};
            }
            valueIndexMap.put(target-nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
