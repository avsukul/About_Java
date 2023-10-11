package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
//        int[] nums = {1,1,2};
//        int[] nums = {0,0,1,1,1,1,1,1,2,2,2,2,3,3,4,4,4,4,4,4,4,4,4,4,155};
//        int[] nums = {1};
//        int[] nums = {1,1};
//        int[] nums = {1,2};
        int[] nums = {1,2,2};
        int k = removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) return nums.length;
        int[] tmp = new int[nums.length];
        int j = 0, k = 0, preValue = 0;
        boolean tmpUpdated = false;
        for (int i = 0; i < nums.length; i++) {

            if (i+1 < nums.length && nums[i] == nums[i+1]) {
                if (preValue == nums[i] && i != 0) continue;
                tmp[j++] = nums[i];
                tmpUpdated = true;

            } else if (i+1 != nums.length && preValue != nums[i]) {
                tmp[j++] = nums[i];

            } else if(i+1 == nums.length) {
                tmp[j++] = nums[i];
            }
            preValue = nums[i];
        }
        for (int n = 0; n < nums.length; n++) {
            if (!tmpUpdated) {
                k = nums.length;
                break;
            }
            if (n > 0 && tmp[n] == 0) {
                k = n;
                break;
            }
            nums[n] = tmp[n];
        }
        return k;
    }
}
