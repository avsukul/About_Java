package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
//        int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,1,1,1,2,2,2,2,3,3,4,4,4,4,4,4,4,4,4,4,155};
//        int[] nums = {1};
//        int[] nums = {1,1};
//        int[] nums = {1,2};
//        int[] nums = {1,2,2};
        int k = removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        int j = 0;
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i +1]) {
                tmp[j++] = nums[i];
            }
        }
        tmp[j++] = nums[nums.length - 1];

        for (int i = 0; i < j; i++) {
            nums[i] = tmp[i];
        }
        return j;
    }
}
