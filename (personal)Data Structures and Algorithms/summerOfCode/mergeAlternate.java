package summerOfCode;
import java.io.*;
import java.util.*;

public class mergeAlternate {
    public static void main(String[] args) {
        String w1 = "abc", w2 = "pqr";
        System.out.println(mergeAlternately(w1,w2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int i = word1.length();
        int j = word2.length();
        int p1 = 0;
        int p2 = 0;

        StringBuilder strout = new StringBuilder();

        while (p1 < i && p2 < j) {
            strout.append(word1.charAt(p1));
            p1++;
            strout.append(word2.charAt(p2));
            p2++;
        }

        while (p1 < i) {
            strout.append(word1.charAt(p1));
            p1++;
        }

        while (p2 < j) {
            strout.append(word2.charAt(p2));
            p2++;
        }

        return strout.toString();
    }
}
