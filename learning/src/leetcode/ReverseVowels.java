package leetcode;

import java.util.Arrays;

public class ReverseVowels {

    public static void main(String[] args) {
//        String s = "hello";
//        String s = "race car";
//        String s = "leetcode";
        String s = "l";
//        String s = "Aa";
        String as = reverseVowels(s);
        System.out.println(as);

    }

    public static String reverseVowels(String s) {
      char[] ca = s.toCharArray();
      int left = 0;
      int right = s.length() - 1;
      String v = "aeiouAEIOU";


      while(left < right) {

          while(left < right && !(v.contains(ca[left] + ""))) {
              left++;
          }

          while(right > left && !(v.contains(ca[right] + ""))) {
              right--;
          }

          char tmp = ca[left];
          ca[left] = ca[right];
          ca[right] = tmp;

          left++;
          right--;
      }
      return String.valueOf(ca);
    }
}
