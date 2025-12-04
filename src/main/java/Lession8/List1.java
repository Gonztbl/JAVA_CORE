package Lession8;

import java.util.ArrayList;
import java.util.Collections;

public class List1 {
    public static void main(String[] args) {
        ArrayList<Student8> danhsach = new ArrayList<>();
        Student8 student81 = new Student8("Long");
        Student8 student82 = new Student8("Long");
        Student8 student83 = new Student8("Long");
        danhsach.add(student81);
        danhsach.add(student82);
        danhsach.add(student83);
        System.out.println("Tong so phan tu: " + danhsach.size());
        System.out.println(danhsach.get(1).toString());
        System.out.println(danhsach.getFirst().toString());
        System.out.println(danhsach.getLast().toString());
        danhsach.add(0, new Student8("Minh"));
        danhsach.add(new Student8("Linh"));
        System.out.println("danh sach sau them: ");
        for (Student8 ds : danhsach) {
            System.out.println(ds);
        }
        Collections.reverse(danhsach);
        System.out.println("Danh sach sau dao");
        for (Student8 ds : danhsach) {
            System.out.println(ds);
        }
        ArrayList<Student8> studentCopies = new ArrayList<>();
        for (Student8 st : danhsach) {
            studentCopies.add(st);
        }

        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).getId() == 2) {
                danhsach.get(i).setName(null);
                System.out.println("Xoa thanh cong");
            }
        }
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).getName().equals("Linh")) {
                danhsach.remove(i);
                System.out.println("Xoa thanh cong");
            }
        }
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).getId() == 2) {
                System.out.println(danhsach.get(i));
            }
        }
    }

    public static void dem(ArrayList<Student8> danhsach) {
        int dem = 0;
        for (int i = 0; i < danhsach.size(); i++) {
            for (int j = i + 1; j < danhsach.size(); j++) {
                if (danhsach.get(i).equals(danhsach.get(j))) {
                    System.out.println("Ten trung: " + danhsach.get(i).getName());
                    dem++;
                }
            }
        }
        System.out.println("So phan tu trung ten: " + dem);
    }

    public static void timtheoid(ArrayList<Student8> danhsach, int id) {
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).getId() == id) {
                System.out.println("thong tin: " + danhsach.get(i));
            }

        }
    }
}


