package ONTAP_Bai7;

public class CourseManager extends Course {
    private Course courses[];
    private int courseCount;

    public CourseManager(int id, String name, String email, int courseCode, String courseName, String instructor, int soluongsv,int soluongkh) {
        super(id, name, email, courseCode, courseName, instructor, soluongsv);
        this.courses = new Course[soluongkh];
        this.courseCount =0;
    }

    public void addCourse(Course c){
        if(courseCount>=courses.length){
            System.out.println("so luong khoa hoc vuot qua gioi han");
            return;
        }
        for(int i=0;i<courseCount;i++){
            if(courses[i].getCourseName().equals(c.getCourseName())){
                System.out.println("Khoa hoc da ton tai");
                return;
            }
        }
        courses[courseCount]=c;
        courseCount++;
    }


    public void registerStudentToCourse(String courseCode, Student s) {

    }


    public void printAllCourses(){
        if(courseCount==0){
            System.out.println("Danh sach rong");
            return;
        }
        for(int i=0;i<courseCount;i++){
            courses[i].printCourseInfo();
        }
    }


    public void printStudentsInCourse(int courseCode)
    {
        if(courseCount==0){
            System.out.println("Danh sach rong");
        }
        for(int i=0;i<courseCount;i++){
            if(courses[i].getCourseCode()==courseCode){
                courses[i].printStudents();
            }
        }
    }

}
