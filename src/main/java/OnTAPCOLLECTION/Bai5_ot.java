package OnTAPCOLLECTION;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai5_ot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String string = scanner.nextLine();
        ArrayList<String> arrayList = new ArrayList<>();
        String[] words = string.split("\\s");
        for (String w : words) {
            arrayList.add(w);
        }
        Set<String> stringSet = new HashSet<>();
        for (String str : arrayList) {
            stringSet.add(str);
        }
        for (String str : stringSet) {
            demtu(arrayList, str);
        }
    }

    public static void demtu(ArrayList<String> arrayList, String tu) {
        int count = 0;
        for (String str : arrayList) {
            if (tu.equals(str)) {
                count++;
            }
        }
        System.out.println(tu + " xuat hien: " + count + " lan.");
    }
}
