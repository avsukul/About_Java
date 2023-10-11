package leetcode;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0) return nums2;
        Map<Integer, List<Integer>> m = new HashMap<>();
        int n2Len = nums2.length;

        for (int n1 : nums1) {
            int n2Index = 0;

            for (int n2 : nums2) {
                 m.putIfAbsent(n1, new ArrayList<>());
                 boolean b = m.get(n1).contains(n2Index);
                if (n1 == n2 && n2Len > 0 && !b) {
                    List<Integer> l = m.get(n1);
                    l.add(n2Index);
                    n2Len--;
                    break;
                }
                n2Index++;
            }

            if (n2Len == 0) break;
        }
        List<Integer> l = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> e: m.entrySet()) {
            int i = 0;
            while (i++ < e.getValue().size()) {
                l.add(e.getKey());
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}
