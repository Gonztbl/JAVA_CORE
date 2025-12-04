package Lession8;

import java.util.Arrays;

public class BaiToanSAPXEP {
    public static void main(String[] args) {
        int[] mang = {1, 2, 5, 0};
        int[] res = ketqua(mang, 2);
        for (int i = 0; i < 2; i++) {
            System.out.println(res[i]);
        }

    }

    public static int[] ketqua(int[] nums, int k) {
        int n = nums.length;
        int[][] arrays = new int[n][2];
        for (int i = 0; i < n; i++) {
            arrays[i][0] = i;
            arrays[i][1] = nums[i];
        }
        Arrays.sort(arrays, (x1, x2) -> Integer.compare(x2[1], x1[1]));
        Arrays.sort(arrays, 0, k, (x1, x2) -> Integer.compare(x1[0], x2[0]));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arrays[i][1];
        }
        return res;
    }
}
