package problems;

public class IsSolvable {

    public static void main(String[] args) {
        int[] arr = new int[] {0,0,0,0,0};
        System.out.println(isSolvable(3, arr, 0));
        int[] arr1 = new int[] {0,0,1,1,1,1};
        System.out.println(isSolvable(4, arr1, 0));
        int[] arr3 = new int[] {0,0,1,1,1,0};
        System.out.println(isSolvable(3, arr3, 0));
        int[] arr4 = new int[] {0,1,0};
        System.out.println(isSolvable(1, arr4, 0));
        int[] arr5 = new int[] {0,1,0,1,0,1};
        System.out.println(isSolvable(2, arr5, 0));
        int[] arr6 = new int[] {0,0,1,1,0,0,1,1,0,0};
        System.out.println(isSolvable(6, arr6, 0));
        int[] arr7 = new int[] {0,0,1,1,0,0,1,1,0,0};
        System.out.println(isSolvable(3, arr7, 0));
    }


    public static boolean isSolvable(int leap, int[] game, int i) {

        if (i >= game.length) {
            return true;
        }

        if (i < 0 || game[i] == 1)
            return false;

        game[i] = 1;

        return isSolvable(leap, game, i + leap) ||
                isSolvable(leap, game, i + 1) ||
                isSolvable(leap, game, i - 1);
    }
}