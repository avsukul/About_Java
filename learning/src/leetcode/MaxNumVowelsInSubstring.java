package leetcode;

import java.util.Arrays;
import java.util.List;

public class MaxNumVowelsInSubstring {


    public static void main(String[] args) {

//        String s = "abciiidef"; int k = 3;
//        String s = "aeiou"; int k = 2;
        String s = "leetcode"; int k = 3;
//        String s = "tryhard"; int k = 4;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        char[] sc = s.toCharArray();
        int cnt = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i >= k && (sc[i - k] == 'a' || sc[i - k] == 'e' || sc[i - k] == 'i' || sc[i - k] == 'o' || sc[i - k] == 'u')) {
                cnt--;
            }

            if (sc[i] == 'a' || sc[i] == 'e' || sc[i] == 'i' || sc[i] == 'o' || sc[i] == 'u') {
                cnt++;
                max = Math.max(max, cnt);
            }
        }

        return max;
    }
}
