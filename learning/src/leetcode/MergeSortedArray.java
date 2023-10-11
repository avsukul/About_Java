package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int [] nums1 = {-1,0,0,3,3,3,0,0,0}; int m = 6; int[] nums2 = {1,2,2}; int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;

        int i = 0, j = 0;
        for (; i < m+n; i++) {
            if (nums1[i] == 0 && j != n) {
                nums1[i] = nums2[j++];
            } else if(nums1[i] == 0) break;
        }
        bubbleSort(nums1);
    }

    private static void bubbleSort(int[] arr) {
        int len = arr.length;
        boolean swapped;

        for (int i = 0; i < len - 1; i++) {
            swapped = false;

            for (int j = 0; j < (len - i - 1); j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
