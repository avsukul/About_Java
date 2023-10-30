package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseWordsInAString {

    public static void main(String[] args) {

//        String s = " a   good      example    for   you";
        String s = "the sky is blue";

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String w = s.trim();
        String[] words = w.split("");
        int spaces = 0;
        StringBuilder sb = new StringBuilder();

        int index = 0;
        while (index < words.length) {
            String letter = words[index++];
            if (!letter.contains(" ")) {
                sb.append(letter);
                spaces = 0;
            } else if (spaces++ < 1) {
                sb.append(" ");
            }
        }
        String[] formattedWord = sb.toString().split(" ");

        StringBuilder finalWords = new StringBuilder();
        for (int i = formattedWord.length - 1 ; i >= 0; i--) {
            finalWords.append(formattedWord[i]);
            if (i != 0) {
                finalWords.append(" ");
            }
        }
        return finalWords.toString();
    }
}
