package leetcode;
//https://leetcode.com/problems/concatenation-of-array/submissions/

//given an array of size n create an array of size 2n that is the concatenation of the original array

//it wasnt a very difficult problem but looking at the fastest solution taught me System.arraycopy which i may not have come accross earlier;

public class ArrayConcatenation {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        System.arraycopy(nums, 0, arr, nums.length, nums.length);
        return arr;
    }
}