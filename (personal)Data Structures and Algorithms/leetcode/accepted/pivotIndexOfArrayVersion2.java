package leetcode.accepted;
//https://leetcode.com/problems/find-pivot-index/

public class pivotIndexOfArrayVersion2 {
    //brute force

    //leetcode tutor's solution

    /**
     * my understanding:
     * first total sum of array is calculated then sum from  0 to i is calculated, simultaneously being checked if the sum from 0 to i, minus the current element minus the net sum
     * -- the resultant comparision of which ends up as leftsum and rightsum and middle index is not included.
     * if leftsum == sum - leftsum - nums[i] i.e leftsum == rightsum -- return i
     */
    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }

}
