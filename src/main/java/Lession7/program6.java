package Lession7;

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        try {
            int age = inputAge();
            System.out.println("age: " + age);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int inputAge() throws Exception {
        int age = 0;
        boolean dieukien = false;
        do {
            try {

                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap age: ");
                age = sc.nextInt();
                if(age<=0){
                    throw new InvalAgelputingExeption("Tuổi phải là số nguyên dương (> 0).");
                }
                dieukien=true;
                if(age<18)
                {
                    System.out.println("Tuoi phai lon hon 18");
                    dieukien=false;
                }

            } catch (InvalAgelputingExeption ex){
                System.out.println(ex.getMessage()+"Yeu cau thuc hien lai");
                dieukien=false;
            }
            catch (Exception e) {
                throw new Exception("vui long nhap age la int");

            }
        } while (!dieukien);
            return age;

    }
}
