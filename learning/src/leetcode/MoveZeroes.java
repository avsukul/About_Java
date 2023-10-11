package leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static  void moveZeroes(int[] nums) {
        int len = nums.length;
        int[] a = new int[nums.length];
        int aIndex = 0;
        for (int i = 0; i <= len - 1; i++) {
            if (nums[i] == 0) {
                a[len - 1] = nums[i];
            } else {
                a[aIndex++] = nums[i];
            }
        }
        for (int j = 0; j <= nums.length -1; j++) {
            nums[j] = a[j];
        }
    }
}
