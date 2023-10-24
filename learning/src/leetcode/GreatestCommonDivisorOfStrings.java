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
        // Check if the concatenation of str1 and str2 is equal to the concatenation of str2 and str1
        if (!(str1 + str2).equals(str2 + str1)) {
            // If they are not equal, there's no common GCD, so return an empty string
            return "";
        }
        // Calculate the GCD of the lengths of str1 and str2
        int len = gcd(str1.length(), str2.length());
        // Return a substring of str1 starting from index 0 and ending at the length of the GCD
        return str1.substring(0, len);
    }

    // Function to calculate the greatest common divisor (GCD) of two numbers
    private static int gcd(int a, int b) {
        // Use the Euclidean algorithm to find the GCD
        return b == 0 ? a : gcd(b, a % b);
    }
}

