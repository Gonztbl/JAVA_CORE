package Lession9;

import java.util.HashSet;
import java.util.Set;

public class MainC3C4 {
    public static void main(String[] args) {
        //khai bao set student;
        Set<Student9> student9Set=new HashSet<>();
        //them
        student9Set.add(new Student9(1,"Long"));
        student9Set.add(new Student9(2,"Linh"));
        //xoa
        for(Student9 student9:student9Set){
            if(student9.getName().equals("Linh")){
                student9Set.remove(student9);
                System.out.println("Xoa thanh cong Linh");
            }
        }
        //hien thi toan bo set
        for(Student9 student9:student9Set){
            System.out.println("Danh sach:");
            System.out.println(student9.toString());
        }
        //tim kiem theo ten
        for(Student9 student9:student9Set){
            if(student9.getName().equals("Long")){
                System.out.println("Thong tin Long");
                System.out.println(student9.toString());
            }
        }
        //Tim kiem theo id
        for(Student9 student9:student9Set){
            if(student9.getId()==2){
                System.out.println(student9.toString());
            }
            else {
                System.out.println("Khong ton tai id=2");
            }
        }
// Cau 4: tao ra 1 danh sach chua name cua cac student khong trung nhau in ra set do;
        Set<String> danhsachten=new HashSet<>();
        for (Student9 student9:student9Set){
            danhsachten.add(student9.getName());
        }
        for(String ten:danhsachten){
            System.out.println("Danh sach ten cua student");
            System.out.println(ten.toString());
        }
    }
}
