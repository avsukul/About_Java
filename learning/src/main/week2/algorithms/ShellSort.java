package main.week2.algorithms;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {

        int[] arr = {20,35,-15,7,55,1,-22};

        int[] result = shellSort(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for(int i = gap; i < arr.length; i++) {

                int newElement = arr[i]; // 7
                int j = i; // j = gap
                while(j >= gap && arr[j - gap] > newElement) { // arr[j - gap] = 20 > 7
                    arr[j] = arr[j - gap];  // 20 in position gap
                    j -= gap;   // j - gap = 0
                }
                arr[j] = newElement;
            }
        }
        return arr;
    }
}