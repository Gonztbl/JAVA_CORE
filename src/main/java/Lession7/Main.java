package Lession7;

import ONTAP_Bai7.Student;

public class Main {
    public static void main(String[] args) {
        Student7[] students = new Student7[3];
        Student7.collecge = "Dai hoc bach khoa";
        students[0] = new Student7(1, "Nguyen Van A");
        students[1] = new Student7(2, "Nguyen Van B");
        students[2] = new Student7(3, "Nguyen Van C");
        Student7.moneyGroup = 100*students.length;
        System.out.println("Quy lop hien tai: "+Student7.moneyGroup);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
            ;
        }
        Student7.moneyGroup=Student7.getMoneyGroup()-50;
        System.out.println("Sau b2: "+Student7.moneyGroup);
        Student7.moneyGroup=Student7.getMoneyGroup()-20;
        System.out.println("Sau b3: "+Student7.moneyGroup);
        Student7.moneyGroup=Student7.getMoneyGroup()-150;
        System.out.println("Sau b4: "+Student7.moneyGroup);
        Student7.moneyGroup=Student7.getMoneyGroup()+50*students.length;
        System.out.println("Sau cung: "+Student7.moneyGroup);

        Student7.collecge = "Dai hoc cong nghe";
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
            ;
        }
        String newcolege="Dai hoc cong nghiep";
        Student7.thaycollege(newcolege);
        System.out.println("Thay the thanh cong: "+Student7.getCollecge());
        int a=3;
        int b=4;
        int sum=MyMath.sum(a,b);
        int max=MyMath.max(a,b);
        int min=MyMath.min(a,b);
        System.out.println("sum"+sum);
        System.out.println("Min"+min);
        System.out.println("max"+max);

    }
}
