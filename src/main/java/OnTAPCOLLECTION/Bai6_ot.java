package OnTAPCOLLECTION;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bai6_ot {
    public static void main(String[] args) {
        ArrayList<Oder> oderArrayList = new ArrayList<>();
        //them don hang
        for (int i = 0; i < 10; i++) {
            oderArrayList.add(new Oder("Long" + i, i * 100));
        }
        oderArrayList.add(new Oder("Long", 20 * 100));
        oderArrayList.add(new Oder("Long10", 10 * 100));
        //tim don hang max
        Collections.sort(oderArrayList);
        System.out.println("Thong tin don hang gia cao nhat: " + oderArrayList.getLast().toString());
        LocalDate cutoffDateTime = LocalDate.of(2025, 12, 3);
        for (Oder oder : oderArrayList) {
            if (oder.getDate().isBefore(cutoffDateTime)) {
                System.out.println(oder.toString());
            } else {
                System.out.println("Khong co don hang.");
                return;
            }
        }
        System.out.println("THEO NGAY");
        Collections.sort(oderArrayList, Comparator.comparing(Oder::getDate));
        for (Oder oder : oderArrayList) {
            System.out.println(oder.toString());
        }
    }
}
