package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchingStrings {
    public static void main(String[] args) {

        List<String> sl = new ArrayList<>(Arrays.asList("def","de","fgh"));
        List<String> qs = new ArrayList<>(Arrays.asList("de","lmn","fgh"));
        matchingStrings(sl, qs);
    }

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> occurrences = new ArrayList<>();
        int counter = 0;

        for (String qs : queries) {

            for (String sList : stringList) {

                if (qs.equals(sList)) {
                    counter++;
                }

            }
            occurrences.add(counter);
            counter = 0;
        }
        return occurrences;
    }

}
