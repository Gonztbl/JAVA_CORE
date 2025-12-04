package Lession8;

import java.util.Scanner;
import java.util.Stack;

public class Stack_AS2 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi tu ban phim: ");
        String string = scanner.next();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        //kiem tra doi xung
        int index = (int) (string.length() - 1);
        System.out.println(index);
        for (int i = 0; i < (int) (string.length() / 2); i++) {
            if (stack.get(index).equals(string.charAt(i))) {
            } else {
                System.out.println("Khong doi xung");
                break;
            }
            index--;
            System.out.println("Doi xung");
        }
        Stack<Character> t1 = new Stack<>();
        Stack<Character> t2 = new Stack<>();
        for (int i = 0; i < (int) (string.length() / 2); i++) {
            //t1.push(string[i]);
        }
        System.out.println("Thong tin tung phan tu");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
