package hackerrank;
//problem URL: https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
//for an array of size n, print the number of subarrays with sum < 0

//solved by yogesh, my approach was lengthy -- keeping this to push to repo and save analogy of iteration

/*sample input:

5
1 -2 4 -5 1

output: 9
 */

import java.util.*;

public class subArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int summ = 0;
        int ctr = 0;
        for (int i=0; i<n; i++){
            summ = 0;
            for (int j=i; j<n; j++){
                summ += arr[j];
                if (summ < 0){
                    ctr += 1;
                }
            }
        }
        System.out.println(ctr);
    }
}