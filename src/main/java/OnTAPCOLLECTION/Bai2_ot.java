package OnTAPCOLLECTION;

import java.util.ArrayList;
import java.util.LinkedList;

public class Bai2_ot {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long time1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        long time2 = System.nanoTime();
        System.out.println("Thong tin thoi gian array: " + ((time2 - time1) / 1000000) + "s");
        long time3 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        long time4 = System.nanoTime();
        System.out.println("Thong tin thoi gian linked: " + ((time4 - time3) / 1000000) + "s");
    }
}
