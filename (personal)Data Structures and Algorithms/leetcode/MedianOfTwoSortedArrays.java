package leetcode;
//https://leetcode.com/problems/median-of-two-sorted-arrays/
//given two sorted arrays of size m and n, find the median of the two arrays
//leetcode hard difficulty

/**
 * i used a non-iterative solution using simple logic and if else, taking into account that the two given arrays are sorted
 *
 * currently passes only the "run" test case and not the "submit" case -- debug later
 */

import java.util.Arrays;
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] medianElements = {0,0,0,0};
        int m = nums1.length;
        int n = nums2.length;
        double median = 0;


        if(m%2 == 0){
            if(n%2 ==0){
                medianElements[0] = nums1[(m/2)-1];
                medianElements[1] = nums1[(m/2)];
                medianElements[2] = nums2[(n/2)-1];
                medianElements[3] = nums2[(n/2)];
            }else{
                medianElements[0] = nums1[(m/2)-1];
                medianElements[1] = nums1[(m/2)];
                medianElements[2] = nums2[(n+1)/2-1];
            }
        }
        else{
            if(n%2 ==0){
                medianElements[1] = nums1[(m+1)/2-1];
                medianElements[2] = nums2[(n/2)-1];
                medianElements[3] = nums2[(n/2)];
            }else{
                medianElements[0] = nums1[(m+1)/2-1];
                medianElements[1] = nums2[(n+1)/2-1];
            }
        }

        Arrays.sort(medianElements);

        if(medianElements[0] == 0 && medianElements[1] ==0){
            median = medianElements[2] < medianElements[3] ? medianElements[2] : medianElements[3];
        }else if(medianElements[0] == 0 && medianElements[1] !=0){
            median = (medianElements[3]+medianElements[2])/2;
        }else median = (medianElements[1]+medianElements[2])/2;

        return median;
    }
}
