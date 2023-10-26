package leetcode;


import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {7,2,1,1,1,5,2,8,5,9,5,5};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int len = nums.length;
        int halfLen = len / 2;

        int preValue = 0;
        boolean f = false;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {

            if (f && preValue == nums[i]) {
                continue;
            } else {
                preValue = 0;
                f = false;
            }

            for (int j = i; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    cnt++;
                    if (cnt >= halfLen) {
                        return nums[j];
                    }
                    if (!f) {
                        preValue = nums[j];
                        f = true;
                    }
                }
            }
            cnt = 0;
        }
        return 0;
    }
}
