package OnTAPCOLLECTION;

import Lession9.Student9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai3_ot {
    public static void main(String[] args) {
        ArrayList<Student9> student9ArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong: ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Nhap thong tin student thu " + (i + 1) + ": ");
            System.out.println("Nhap name: ");
            String name = scanner.next();
            Student9 student9 = new Student9(i, name);
            student9ArrayList.add(student9);
        }
        Set<String> student9Set = new HashSet<>();
        for (Student9 student9 : student9ArrayList) {
            student9Set.add(student9.getName());
        }
        System.out.println("Danh sach name student: ");
        for (String string : student9Set) {
            System.out.println(string);
        }
    }
}
