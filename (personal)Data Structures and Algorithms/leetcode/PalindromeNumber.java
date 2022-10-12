package leetcode;
//https://leetcode.com/problems/palindrome-number/solution/
//Given an integer x, return true if x is palindrome integer.


public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int n = str.length();
        
        for(int i = 0; i < (int)n/2; i ++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }return true;
    }

}
