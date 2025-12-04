package Lession9;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainC1C2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Long1");
        linkedList.addFirst("Long0");
        linkedList.addLast("Long N");
        System.out.println("Phan tu dau tien: "+linkedList.getFirst().toString());
        System.out.println("Phan tu cuoi cung: "+linkedList.getLast().toString());
        linkedList.removeFirst();
        System.out.println("Xoa phan tu day tien thanh cong");
        linkedList.removeLast();
        System.out.println("Xoa phan tu cuoi cung than cong");
        for(String s:linkedList){
            System.out.println("Phan tu: "+s.toString());
        }
        long s1=System.nanoTime();
        ArrayList<String> arrayList=new ArrayList<>();
        for(int i=0;i<100000;i++){
            arrayList.add("Longarr"+i);
        }
        long s2=System.nanoTime();
        System.out.println("Thoi gian array them: "+(s2-s1));
        LinkedList<String> linkedList1=new LinkedList<>();
        long s3=System.nanoTime();
        for(int i=0;i<100000;i++){
            linkedList1.add("Longlink: "+i);
        }
        long s4=System.nanoTime();
        System.out.println("Thoi gian link them: "+(s4-s3));
        //Truy cap phan tu o giua danh sach:
        long s5=System.nanoTime();
        for(int i=0;i<1000;i++){
            String arr=arrayList.get(50000);
        }
        long s6=System.nanoTime();
        System.out.println("Thoi gian array truy cap: "+(s6-s5));
        long s7=System.nanoTime();
        for(int i=0;i<1000;i++){
            String link=linkedList1.get(50000);
        }
        long s8=System.nanoTime();
        System.out.println("Thoi gian link truy cap: "+(s8-s7));
        //xoa 100 phan tu
        long s9=System.nanoTime();
        for(int i=1;i<100;i++){
            arrayList.remove(i);
        }
        long s10=System.nanoTime();
        System.out.println("Thoi gian array xoa: "+(s10-s9));
        long s11=System.nanoTime();
        for(int i=1;i<100;i++){
            linkedList1.remove(i);
        }
        long s12=System.nanoTime();
        System.out.println("Thoi gian link xoa: "+(s12-s11));
    }
}
