package Lession9;

import java.util.*;

public class MainC6C7 {
    public static void main(String[] args) {
        Map<Student9,String> student9s=new HashMap<>();
        student9s.put(new Student9(1,"Long1"),"Long1");
        student9s.put(new Student9(2,"Long2"),"Long2");
        student9s.put(new Student9(3,"Long3"),"Long3");
        student9s.put(new Student9(4,"Long4"),"Long4");
        for(int i=5;i<10;i++){
            Student9 student9=new Student9(i,"Long"+i);
            student9s.put(student9,student9.getName());
        }
        System.out.println("Khoi tao thanh cong");
        System.out.println("danh sach key: ");
        for(Student9 key:student9s.keySet()){
            System.out.println(key);
        }
        System.out.println("Thong tin value: ");
        for(Student9 key:student9s.keySet()){
            System.out.println(student9s.get(key));
        }
        //in ra ds
// 1. Tạo một List từ keySet
        List<Student9> sortedKeys = new ArrayList<>(student9s.keySet());

// 2. Sắp xếp List đó
        Collections.sort(sortedKeys); // Cần import java.util.Collections và java.util.ArrayList

// 3. Duyệt qua List đã sắp xếp và lấy giá trị từ Map
        System.out.println("\nThong tin value theo key đã sắp xếp (dùng List):");
        for (Student9 key : sortedKeys) {
            System.out.println(student9s.get(key));
        }
        //chuyen doi map set
        Set<Student9> student9Set=new HashSet<>();
        for(Student9 student:student9s.keySet()){
            student9Set.add(student);
        }
        System.out.println("Thong tin value theo key đã sắp xếp (dùng Stream):");

        student9s.keySet().stream() // 1. Lấy tập hợp key và tạo stream
                .sorted()              // 2. Sắp xếp các key (dựa trên compareTo trong Student9)
                .forEach(key -> System.out.println(student9s.get(key)));

    }

}
