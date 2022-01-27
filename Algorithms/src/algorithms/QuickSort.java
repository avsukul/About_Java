package algorithms;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        quickSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(arr, start, end); // already position the pivot
        quickSort(arr, start, pivotIndex); // sort left sub-array
        quickSort(arr, pivotIndex + 1, end);    // sort right sub-array
    }

    private static int partition(int[] arr, int start, int end) {
        // This is using the first element as the pivot
        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j) {

            while( i < j  && arr[--j] >= pivot);
            if (i < j ) {
                arr[i] = arr[j];
            }

            while(i < j && arr[++i] <= pivot);
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }
}
