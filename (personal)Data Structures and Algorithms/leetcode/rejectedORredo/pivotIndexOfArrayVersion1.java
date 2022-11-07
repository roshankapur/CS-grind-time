package leetcode.rejectedORredo;
//https://leetcode.com/problems/find-pivot-index/

public class pivotIndexOfArrayVersion1 {
    //brute force

    //346 / 745 test cases passed.
    //wrote this myself passed half the test cases but could not check for pivot DNE
    //likely cause of error was presence of negative integers and the fact that i use a single comparison to check invalidation
    public int pivotIndex(int[] nums) {
        if(nums == null) return -1; //nullcheck

        int leftsum = nums[0], rightsum = 0, idx = 1;

        for (int i = 2; i < nums.length; i++) {
            rightsum += nums[i];
        }

        while(leftsum != rightsum){
            //special case
            if (idx == 0 || idx == nums.length-1) return -1;
            if (leftsum > rightsum) return 0;

            //default case
            leftsum += nums[idx];
            rightsum -= nums[idx+1];
            idx++;
        }

        return idx;
    }

}
