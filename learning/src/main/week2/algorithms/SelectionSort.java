package main.week2.algorithms;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};

        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr) {

        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestNumber = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {

                if (arr[i] > arr[largestNumber]) {
                    largestNumber = i;
                }
            }
            Sort.swap(arr, largestNumber, lastUnsortedIndex);
        }
        return arr;
    }

}
