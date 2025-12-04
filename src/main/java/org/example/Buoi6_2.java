package org.example;

import java.time.LocalDateTime;

public class Buoi6_2 {
    public static void main(String[] args) {
        PhongBan phongBan = new PhongBan();
        //System.out.println(phongBan.departmentID);
        PhongBan phongBan1 = new PhongBan(1);
        System.out.println(phongBan1);
        PhongBan phongBan2 = new PhongBan(2, "JAVA");
        TaiKhoan taiKhoan = new TaiKhoan();
        TaiKhoan taiKhoan1 = new TaiKhoan(1, "Long", "Trinh", "Bao", "long28072004");
        TaiKhoan taiKhoan2 = new TaiKhoan(2, "Long", "Trinh", "Bao", "Baolong", 1, LocalDateTime.now());
        TaiKhoan taiKhoan3 = new TaiKhoan(3, 2, "Trinh", "Bao", "Longne", "Trinh");
        System.out.println(taiKhoan);
        System.out.println(taiKhoan1);
        System.out.println(taiKhoan2);
        System.out.println(taiKhoan3);
    }

}
