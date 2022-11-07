package leetcode.rejectedORredo;
//https://leetcode.com/problems/isomorphic-strings

import java.util.HashMap;
//i couldnt for the life of me get this question done


//passes 37/44 cases
public class isomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;
        HashMap<Character,Character> isomap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(isomap.containsKey(s.charAt(i)) && isomap.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            else{
                isomap.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
