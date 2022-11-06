package leetcode;

//https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1

public class OneDArray_runningsum {

    public int[] runningSum(int[] nums){
        int out;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                out = nums[0];
            }else out = nums[i] + nums[i-1];
            nums[i] = out;
        }

        return nums;
    }

}
