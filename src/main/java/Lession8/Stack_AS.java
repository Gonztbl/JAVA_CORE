package Lession8;

import java.util.Scanner;
import java.util.Stack;

public class Stack_AS {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua stack: ");
        int soluong = scanner.nextInt();
        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhap phan tu muon them vao stack: ");
            Integer int1 = scanner.nextInt();
            stack.push(int1);
        }
        System.out.println("Thong tin toan bo phan tu: " + stack);

    }
}
