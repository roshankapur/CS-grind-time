package leetcode.accepted;
//https://leetcode.com/problems/two-sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to


import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        HashMap<Integer,Integer> arrHM = new HashMap<>();        
        
        for (int i = 0; i < nums.length; i++) {
            if(arrHM.containsKey(target - nums[i])){
                indices[1] = i;
                indices[0] = arrHM.get(target - nums[i]);
            }
            arrHM.put(nums[i], i);
        }
        
        
        return indices;
    }
}