package org.example;

import java.util.Scanner;

public class Buoi5_1 {
    public static void main(String[] args) {
        //cau1: nhap 1 xau ki tu dem so luong cac tu trong xau do
        String xau1 = "Trinh Bao Long";
        System.out.println(xau1.trim().length());
        //cau2: noi 2 xau
        String xau2 = " Student Of Class Java Core";
        System.out.println(xau1.concat(xau2));
        //cau3:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String xau3 = scanner.next();
        scanner.nextLine();
        String tam = xau3.substring(0, 1);
        String tam2 = xau3.substring(1);
        System.out.println(tam.toUpperCase().concat(tam2));
        //cau4:
        System.out.println("Nhap ten lan 2: ");
        String xau4 = scanner.next();
        for (int i = 0; i < xau4.length(); i++) {
            System.out.println("Ky tu thu " + (i + 1) + " la: " + xau4.toUpperCase().charAt(i));
        }
        //cau5:
        System.out.println("Nhap ho: ");
        String ho = scanner.next();
        System.out.println("Nhap ten: ");
        String ten = scanner.next();
        System.out.println("Ho va ten: " + ho.concat(" " + ten));
    }
}
