package main.week2.algorithms;

public class RadixSort {


    public static void main(String[] args) {

//        int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };
        String[] radixArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

//        radixSort(radixArray, 10, 4);
//        radixSort(radixArray, 26, 5);

        for (int i = 0; i < radixArray.length; i++) {
            for (int j = 0; j < radixArray.length; j++) {
                int v = 'z' - 'a';
                System.out.println(radixArray[i].charAt(j) - 'a');
            }
            System.out.println(" \n");
        }
    }

    public static void radixSort(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {   // traverse through value
            radixSingleSort(input, radix,  i);
        }
    }

    public static void radixSingleSort(String[] input, int radix, int position) {


        int numItems = input.length;    // get num of items in array
        int[] countArray = new int[radix];  // create an array

        for (String value: input) {
            countArray[getIndex(position, value)]++; // get each digit in value
        }
        for (int j = 1; j < radix; j++) {      // Adjust the count array
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems]; // create a temporary array
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input[tempIndex])]] =
                    input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }

    }


    public static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }

//    public static int getDigit(int position, String value, int radix) {
//        return value / (int) Math.pow(radix, position) % radix;
//    }

}