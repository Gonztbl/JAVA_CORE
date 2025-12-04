package ONTAP_Bai1;



public class Main
{
    public static void main(String[] args) {
        Student student=new Student("Trinh Bao Long",21,"Long@gmail.com");
        student.printInfo();
        StudentManager studentManager=new StudentManager(10);
        studentManager.addStudent(student);
        studentManager.showAll();
        studentManager.findByEmail("Long@gmail.com");
    }
}
