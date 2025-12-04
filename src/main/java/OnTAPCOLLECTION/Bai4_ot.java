package OnTAPCOLLECTION;

import Lession9.Student9;

import java.util.ArrayList;

public class Bai4_ot {
    public static void main(String[] args) {
        ArrayList<Student9> classA = new ArrayList<>();
        ArrayList<Student9> classB = new ArrayList<>();
        classA.add(new Student9(1, "Long"));
        classB.add(new Student9(1, "Long"));
        for (Student9 student9 : classA) {
            for (Student9 student10 : classB) {
                if (student9.equals(student10)) {
                    System.out.println("Thong tin student hoc o 2 lop: " + student9.toString());
                }
            }
        }
    }
}
