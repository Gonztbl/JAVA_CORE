package org.example;

public class Buoi_6 {
    public static void main(String[] args) {
        PhongBan[] danhsachPhongBan = new PhongBan[10];
        //Cau1: thong tin phong ban 1 su dung tostring
        danhsachPhongBan[0] = new PhongBan(0, "JAVA_CORE");
        System.out.println(danhsachPhongBan[0].toString());


        //Cau2: in ra tat ca phong ban
        for (PhongBan ds : danhsachPhongBan) {
            if (ds != null) {
                System.out.println(ds.toString());
            }
        }
        //Cau3: in ra dia chi
        System.out.println(danhsachPhongBan[0].hashCode());


        //cau4: kiem tra phong ban 1 co dung la ""Phong ban A"
        String tenphongkiemtra = "Phong Ban A";
        //System.out.println(danhsachPhongBan[0].departmentName.equals(tenphongkiemtra));


        //Cau5: so sanh 2 phong ban 1 va 2 xem co bang nhau khong(khi ten=nhau)
        danhsachPhongBan[1] = new PhongBan(1, "JAVA_CORE");
        System.out.println(danhsachPhongBan[0].equals(danhsachPhongBan[1]));

    }

}
