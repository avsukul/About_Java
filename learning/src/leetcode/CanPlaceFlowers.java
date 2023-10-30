package leetcode;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0}; int n = 1;
//        int[] flowerbed = {1,0,0,0,1}; int n = 1;
//        int[] flowerbed = {1,0,0,0,1}; int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int empty = 0;
        if (n == empty) return true;
        int canPlant = 3;
        int cnt = 0;
        int index = 0;
        for (int bed : flowerbed) {
            if (bed == empty) {
                cnt++;
                if (index == 0 || index == flowerbed.length - 1) {
                    cnt++;
                }
                if (cnt >= canPlant || flowerbed.length == 1) {
                    n--;
                    if (n == 0) {
                        return true;
                    }
                    cnt = 1;
                }
                index++;
                continue;
            }
            index++;
            cnt = 0;
        }
        return false;
    }
}
