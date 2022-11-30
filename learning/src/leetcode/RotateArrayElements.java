package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayElements {

    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(rotateLeft(1, list0));

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(rotateRight(1, list1));
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        Integer[] ar = new Integer[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            // get the element at (i)index.
            int v = arr.get(i);

            // get index to insert element.
            int index = i - d;

            // check if at start of array.
            if (index >= 0) {
                // insert element into index.
                ar[index] = v;

            } else {
                // insert element into index.
                ar[index + ar.length] = v;
            }
        }
        arr.clear();
        arr.addAll(Arrays.asList(ar));
        return arr;
    }

    public static List<Integer> rotateRight(int d, List<Integer> arr) {
        Integer[] ar = new Integer[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            // get the element at (i)index.
            int v = arr.get(i);

            // get index to insert element.
            int index = i + d;

            // check if at end of array.
            if (index <= ar.length - 1) {
                // insert element into index.
                ar[index] = v;

            } else {
                // insert element into index.
                ar[index - ar.length] = v;
            }
        }
        arr.clear();
        arr.addAll(Arrays.asList(ar));
        return arr;
    }

}
