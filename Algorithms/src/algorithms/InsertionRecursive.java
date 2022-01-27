package algorithms;

public class InsertionRecursive {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        insertionRecursive(intArray, intArray.length);

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    private static void insertionRecursive(int[] input, int num) {
        if (num < 2) {
            return;
        }

        insertionRecursive(input, num - 1);

        int newElement = input[num - 1];
        int i;

        for(i = num - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;

    }

}
