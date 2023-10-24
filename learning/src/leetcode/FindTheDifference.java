package leetcode;

import java.util.*;
import java.util.stream.Stream;

public class FindTheDifference {

    public static void main(String[] args) {
        String s = "abcd",
               t = "abcd";

        char diff = new FindTheDifference().findTheDifference(s, t);

        System.out.println(diff);
    }

    public char findTheDifference(String s, String t) {
        char c = 0;
        for (char ss : s.toCharArray()){
            System.out.println(Integer.toBinaryString(ss));
            c ^= ss;
        }
        for (char tt : t.toCharArray()) {
            System.out.println(Integer.toBinaryString(tt));
            c ^= tt;
        }
        return c;
    }
}
