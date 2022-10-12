package leetcode;
//https://leetcode.com/problems/median-of-two-sorted-arrays/
//given two sorted arrays of size m and n, find the median of the two arrays
//leetcode hard difficulty

/**
 * i used a non-iterative solution using simple logic and if else, taking into account that the two given arrays are sorted
 *
 * currently passes only the "run" test case and not the "submit" case -- debug later
 * [1,2]
 * [3,4]
 * out : 2.5
 */

import java.util.Arrays;
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = new int[1];

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] medianElements = {0,0,0,0};
        int m = nums1.length;
        int n = nums2.length;
        double median = 0;

        if(m==1) medianElements[0] = nums1[0];
        else if(m%2 == 0 && m!=0){
            medianElements[0] = nums1[(m/2)-1];
            medianElements[1] = nums1[(m/2)];
        }else if(m%2 != 0 && m>1){medianElements[0] = nums1[(m+1)/2-1];}

        if(n==1) medianElements[3] = nums2[0];
        else if(n%2 == 0 && n!=0){
            medianElements[2] = nums2[(n/2)-1];
            medianElements[3] = nums2[(n/2)];
        }else if(n%2 != 0 && n>1){medianElements[3] = nums2[(n+1)/2-1];}

        Arrays.sort(medianElements);

        if(medianElements[0] == 0 && medianElements[1] ==0){
            median = medianElements[2] < medianElements[3] ? medianElements[2] : medianElements[3];
        }else if(medianElements[0] == 0 && medianElements[1] !=0){
            median = (medianElements[3]+medianElements[2])/2;
        }else median = (double) (medianElements[1]+medianElements[2])/2;

        return median;
    }
}
