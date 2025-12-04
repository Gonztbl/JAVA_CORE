package OnTAPCOLLECTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1_ot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang do nguyen: ");
        int count = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            int int1 = scanner.nextInt();
            arrayList.add(int1);
        }
        Collections.sort(arrayList);
        System.out.println("Thong tin max: " + arrayList.getLast());

    }

}
