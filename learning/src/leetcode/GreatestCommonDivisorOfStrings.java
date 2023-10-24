package leetcode;

public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {
//        String str1 = "ABCDEF", str2 = "ABC";
//        String str1 = "ABCABC", str2 = "ABC";
//        String str1 = "ABABAB", str2 = "ABAB";
//        String str1 = "LEET", str2 = "CODE";
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX", str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";


        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int len = gcd(str1.length(), str2.length());

        return str1.substring(0, len);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

