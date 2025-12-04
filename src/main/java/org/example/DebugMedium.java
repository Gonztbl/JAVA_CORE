package org.example;

public class DebugMedium {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 8, 3, 5};
        int result = countSpecialPairs(arr);
        System.out.println("Kết quả: " + result);
    }

    public static int countSpecialPairs(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % 2 == 0 && Math.abs(arr[i] - arr[j]) == 2) {
                    count++;
                }
            }
        }

        return count;
    }
}
