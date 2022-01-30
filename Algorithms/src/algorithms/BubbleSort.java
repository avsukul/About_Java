package algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, -9, 20, -35, 2, 25, -1, 101, 27};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {

        for (int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (arr[j] > arr[j+1]) {
                    Sort.swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

}

class Sort {

    public static void swap(int[] arr, int i, int j) {
        if (arr[i] == arr[j]) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
