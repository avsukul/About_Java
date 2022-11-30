package problems;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ArrayManipulation {

    public static void main(String[] args) {
        Integer[][] arr = {{1,5,3}, {4,8,7}, {6,9,1}};
        List<List<Integer>> queries = Arrays.stream(arr)
                .map(Arrays::asList)
                .collect(Collectors.toList());
        System.out.println(arrayManipulation(10, queries));
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        final SortedMap<Integer, Long> map = new TreeMap<>();

        for (final List<Integer> l : queries) {
            map.put(l.get(0), map.getOrDefault(l.get(0), 0L) + l.get(2));
            map.put(l.get(1) + 1, map.getOrDefault(l.get(1) + 1, 0L) - l.get(2));
        }

        long max = 0;
        long sum = 0;

        for (final long i : map.values()) {
            sum += i;

            if (sum >= max) {
                max = sum;
            }
        }
        return max;
    }
}
