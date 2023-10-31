package leetcode;

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {
//        int[] nums = {2,1,5,0,4,6};
        int[] nums = {20,100,10,12,5,13};
//        int[] nums = {1,2,3,4,5,6};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        final int TRIPLET = 3;

        if (nums.length < TRIPLET) return false;

        for (int num : nums) {
            if (num <= i) {
                i = num;

            } else if (num <= j) {
                j = num;

            } else {
                return true;
            }
        }
        return false;
//        int n = nums.length;
//        final int TRIPLET_EXIST = 3;
//        if (n < TRIPLET_EXIST) return false;
//
//        int triplet = 1;
//        for (int i = 0; i < n; i++) {
//
//            if (i != n - 1) {
//                if (nums[i] < nums[i+1]) {
//                    triplet++;
//                } else {
//                    triplet = 1;
//                }
//            }
//            if (triplet == TRIPLET_EXIST) return true;
//        }
//        return false;
    }
}
