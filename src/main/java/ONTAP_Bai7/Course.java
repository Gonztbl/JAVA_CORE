package ONTAP_Bai7;

import java.util.Arrays;

public class Course extends Student {
    private int courseCode;
    private String courseName;
    private String instructor;
    private Student students[];
    private int studentCount;

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }


    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public Course(int id, String name, String email, int courseCode, String courseName, String instructor, int soluongsv) {
        super(id, name, email);
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[soluongsv];
        this.studentCount = 0;
    }

    public void addStudent(Student s) {
        if (studentCount >= students.length) {
            System.out.println("So luong vuot qua gioi han");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getName().equals(s.getName())) {
                System.out.println("Thong tin da ton tai");
                return;
            }
        }
        students[studentCount] = s;
        studentCount++;
    }


    public void printCourseInfo() {
        System.out.println("Course{" +
                "courseCode=" + courseCode +
                ", courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", students=" + Arrays.toString(students) +
                ", studentCount=" + studentCount +
                '}');
    }


    public void printStudents() {
        if (studentCount == 0) {
            System.out.println("Khong co hoc sinh");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            students[i].printInfo();
        }
    }
}


