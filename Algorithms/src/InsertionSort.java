import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {20,35,-15,7,55,1,-22};

        int[] result = insertionSort(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] insertionSort(int[] arr) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {

            int newElement = arr[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;

        }
        return arr;
    }
}
