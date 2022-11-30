import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Practice {

    // Driver program to test above functions.
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void quickSort(int[] arr, int left, int right) {
        // base case
        // if left is great or equal than sorting of partition is done
        if (left >= right) {
            return;
        }

        // get pivot
        int pivot = arr[(left + right) / 2];
        // get pivot index
        int pivotIndex = partition(arr, left, right, pivot);
        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex, right);
    }

    private static int partition(int[] arr, int left, int right, int pivot) {
        // while loop to go through arr of partition
        while (left <= right) {
            // if left value is less than pivot ++ pivot
            while (arr[left] < pivot) {
                left++;
            }
            // if right value is greater than pivot -- pivot
            while (arr[right] > pivot) {
                right--;
            }

            // if left index is less than right index pass index to swap
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        // return left pivot index
        return left;
    }

    private static void swap(int[] arr, int left, int right) {
       int tmp = arr[left];
       arr[left] = arr[right];
       arr[right] = tmp;
    }

}


class RadixSort {

    public static void main(String[] args) {
        System.out.println("Radix Sort!");
        int[] input = {81,1,3,23,54,74,4,6,7,4,23};
        radixSort(input);

        Arrays.stream(input).forEach(System.out::println);
    }

    private static void radixSort(int[] input) {
        // declare and init a bucket[]
        final int RADIX = 10;
        List<Integer>[] bucket = new ArrayList[RADIX];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        // sort
        boolean maxLength = false;
        int tmp, placement = 1;
        while (!maxLength) {
            maxLength = true;

            // split input array between lists
            for (Integer i : input) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }

            // empty lists into input array
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    input[a++] = i;
                }
                bucket[b].clear();
            }

            // move to next digit
            placement *= RADIX;
        }
    }
}