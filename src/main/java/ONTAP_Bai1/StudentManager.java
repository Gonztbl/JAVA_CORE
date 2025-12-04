package ONTAP_Bai1;

public class StudentManager {
    private Student[] students;
    private int count;

    public StudentManager(int capacity) {
        this.students = new Student[capacity];
        this.count=0;
    }

    public void addStudent(Student student){
        if(count>=students.length){
            return;
        }

        for(int i=0;i<count;i++){
            if(students[i].getName().equals(student.getName())){
                System.out.println("Hoc sinh nay da ton tai");
                return;
            }
        }
        students[count]=student;
        count++;
        System.out.println("Them sinh vien thanh cong");

    }
    public void showAll(){
        if(students[0] ==null){
            System.out.println("danh sach trong");
        }
        for (int i=0;i<count;i++){
            students[i].printInfo();
        }
    }
    public void findByEmail(String findemail){
        if(students[0] ==null){
            System.out.println("danh sach trong");
        }

        for(int i=0;i<count;i++){
            if(students[i].getEmail().equals(findemail)){
                System.out.println("Da tim thay thong tin email");
                students[i].printInfo();
                return;
            }
        }
    }
}
