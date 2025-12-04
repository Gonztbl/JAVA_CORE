package Lession6;

public class Main {
    public static void main(String[] args) {
        Student[] danhsach = new Student[10];
        for (int i = 0; i < 3; i++) {
            danhsach[i] = new Student(i, "student " + i, 1);
        }
        for (int i = 3; i < 6; i++) {
            danhsach[i] = new Student(i, "student " + i, 2);
        }
        for (int i = 6; i < 10; i++) {
            danhsach[i] = new Student(i, "student " + i, 3);
        }
        for (Student student : danhsach) {
            if (student.getGroup() == 1) {
                student.hocbai();
            }
        }
        for (Student student : danhsach) {
            student.diemdanh();
        }
        for (Student student : danhsach) {
            if (student.getGroup() == 2) {
                student.didonvesinh();
            }
        }
    }
}
