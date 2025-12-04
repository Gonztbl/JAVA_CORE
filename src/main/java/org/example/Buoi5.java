//package org.example;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Scanner;
//
//public class Buoi5 {
//    public static void main(String[] args) {
////        //byte short int long
////        // int
////        // long chua khoang gia tri rong hon chua int
//// ép kiểu dữ liệu: ep tu rong hon sang nho hon: double>float>long>int>\\|| byte → short → int → long → float → double
////        int number = 1;
////        long numberlong = number;
////        System.out.println(numberlong);
//////ep
////        long number2 = 100;
////        int numberint2 = (int) number2;
////        // nguyen/nguyen=nguyen
////        //thuc/thuc=thuc/nguyen=nguyen/thuc=thuc
////        //vi du
////        int so1=10/5;
////        float so2=(float) 10/6;
////        float so3=(float)(10/6);
////        System.out.println(so1);
////        System.out.println((so2));
////        System.out.println(so3);
////Cau1:
//        float luong1 = 5240.5f;
//        float luong2 = 10970.055f;
//        int luongs1 = (int) luong1;
//        int luongs2 = (int) luong2;
//        System.out.println("Luong so 1 : " + luongs1);
//        System.out.println("Luong so 1 : " + luongs2);
////Cau2:
//
////Cau4:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap a: ");
//        int a = scanner.nextInt();
//        System.out.println("Nhap b: ");
//        int b = scanner.nextInt();
//        float c = tinhthuong(a, b);
//        System.out.println("Thuong 2 so a va b: " + c);
//        //Cau 1:
//        TaiKhoan[] danhsach = new TaiKhoan[5];
//        for (int i = 0; i < danhsach.length; i++) {
//            danhsach[i] = new TaiKhoan();
//            danhsach[i].userName = "user name " + (i + 1);
//            danhsach[i].fullName = "full name " + (i + 1);
//            danhsach[i].createDate = LocalDateTime.now();
//        }
//        for (TaiKhoan ds : danhsach) {
//            System.out.println("Thong tin user");
//            System.out.println(ds.userName);
//            System.out.println(ds.fullName);
//            System.out.println("date: " + ds.createDate);
//        }
//
//    }
//
//    public static float tinhthuong(int a, int b) {
//        return (float) a / b;
//    }
//}
