package leetcode;

import java.util.Arrays;

public class StringCompression {

    public static void main(String[] args) {
//        char[] chars = {'a','a','b','b','c','c','c'};
//        char[] chars = {'a'};
        char[] chars = {'a','a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int cntChars = 1;

        for (int i = 0; i < chars.length; i++) {

            if (i == 0) {
                sb.append(chars[i]);

            } else if (sb.charAt(sb.length() - 1) == chars[i]) {
                cntChars++;

            } else {
                addGroupLength(cntChars, sb);
                sb.append(chars[i]);
                cntChars = 1;
            }
        }
        addGroupLength(cntChars, sb);

        for (int j = 0; j < chars.length; j++) {
            if (sb.length() == j) {
                return j;
            } else {
                chars[j] = sb.charAt(j);
            }
        }
        return chars.length;
    }

    private static void addGroupLength(int cnChars, StringBuilder sb) {
        if (cnChars > 1) sb.append(cnChars);
    }
}
