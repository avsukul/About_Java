package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
//        int[] candies = {12,1,12};
//        int[] candies = {2,3,5,1,3};
        int extraCandies = 1;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int c : candies) {
           max = Math.max(max, c);
        }

        List<Boolean> result = new ArrayList<>();
        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }
        return result;
    }
}
