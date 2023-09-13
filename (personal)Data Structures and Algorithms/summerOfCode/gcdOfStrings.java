package summerOfCode;

public class gcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        StringBuilder str = new StringBuilder();

        if (!str1.concat(str2).equals(str2.concat(str1))) return "";
        int gcd = findGCD(len1, len2);
        return str1.substring(0, gcd);
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
