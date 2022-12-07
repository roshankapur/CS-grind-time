package leetcode.accepted;

//https://leetcode.com/problems/binary-search/
//perform binary search on an array;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int mid;

        while(start <= end){
            mid = (start + end)/2;
            if(target < nums[mid]) {end = mid -1;}
            else if(target > nums[mid]) {start = mid +1;}
            else return mid;
        }

        return -1;
    }
}
