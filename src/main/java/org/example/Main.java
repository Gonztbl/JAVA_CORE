package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import static org.example.Iscorrect.Dung;
import static org.example.Iscorrect.Sai;

public class Main {
    public static void main(String[] args) {
//        int departmentID = 10;
//        String departmentNaem = "Long";
//        int position_id;
//        String position_name;
//        int account_id;
//        String email;
//        String username;
//        String fullname;
//        int department_id;
//        Date create_date_account = new Date();
//        Date create_date_group = new Date();
//        int group_id;
//        Date join_date = new Date();
//        String type_name;
//        String category_name;
//        String content_question;
//        int category_id;
//        int type_id;
//        Date create_date_question = new Date();
//        String content_answer;
//        int question_id;
//        String is_correct;
//        int code;
//        String title;
//        int duration;
//        Date create_date_exam = new Date();
//        int exam_id;
//
//
//        // khoi tao 1 mang chua danh sach ten cua cac phong ban 10 phantu
//        String[] danhsachtenphongban = {"mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin", "muoi"};
//        // khoi tao 1 mang chua danh sach chieu cao theo met 10 phantu
//        float[] danhsachchieucao = new float[10];
//        danhsachchieucao[1] = 1.6f;
//        danhsachchieucao[2] = 3.14f;
//        System.out.println(Arrays.toString(danhsachchieucao));
//        // thiet lap cho mang chua danh sach ten cua cac phong ban chua cac phong ban sau: sale IT ,marketing
//        danhsachtenphongban[9] = "sale";
//        danhsachtenphongban[8] = "IT";
//        danhsachtenphongban[7] = "marketing";
//        System.out.println(Arrays.toString(danhsachtenphongban));
//        //in ra phong ban so 3 trong bang
//        System.out.println("phong ban so 3 co ten: " + danhsachtenphongban[2]);
//        //in ra so luong phan tu trong bang chieu cao
//        System.out.println("so luong phan tu trong bang chieu cao: " + danhsachchieucao.length);
//        //-----------------------------------------Create thong tin cho 3 -----------------------------------------
//        BaiKiemTra ktra1 = new BaiKiemTra(1, 1, "Ktra1", 1, 1, 1, LocalDate.of(2004, 07, 28));
//        BaiKiemTra ktra2 = new BaiKiemTra(2, 2, "Ktra2", 2, 2, 2, LocalDate.of(2004, 07, 28));
//        BaiKiemTra ktra3 = new BaiKiemTra(3, 3, "Ktra3", 3, 3, 3, LocalDate.of(2004, 07, 28));
//
//
//        TaiKhoan taiKhoan1 = new TaiKhoan(1, "Trinh Bao Long 1", 1, 1, LocalDate.of(2004, 07, 28));
//        TaiKhoan taiKhoan2 = new TaiKhoan(2, "Trinh Bao Long 2", 2, 2, LocalDate.of(2004, 07, 28));
//        TaiKhoan taiKhoan3 = new TaiKhoan(3, "Trinh Bao Long 3", 3, 3, LocalDate.of(2004, 07, 28));
//
//
//        PhongBan phongBan1 = new PhongBan(1, "Sale");
//        PhongBan phongBan2 = new PhongBan(2, "Marketing");
//        PhongBan phongBan3 = new PhongBan(3, "IT Support");
//
//
//        ChucVu chucVu1 = new ChucVu(1, "Nhan Vien");
//        ChucVu chucVu2 = new ChucVu(2, "Bao Ve");
//        ChucVu chucVu3 = new ChucVu(3, "Giam Doc");
//
//
//        BaiKiemTraCauHoi ktch1 = new BaiKiemTraCauHoi(1, 1);
//        BaiKiemTraCauHoi ktch2 = new BaiKiemTraCauHoi(2, 2);
//        BaiKiemTraCauHoi ktch3 = new BaiKiemTraCauHoi(3, 3);
//
//
//        CauHoi ch1 = new CauHoi(1, "Quoc gia dong dan nhat the gioi? ", 1, 1, 1, LocalDate.of(2004, 07, 28));
//        CauHoi ch2 = new CauHoi(1, "Quoc gia dong giau nhat the gioi? ", 1, 1, 1, LocalDate.of(2004, 07, 28));
//        CauHoi ch3 = new CauHoi(1, "Quoc gia dong o nhiem nhat the gioi? ", 1, 1, 1, LocalDate.of(2004, 07, 28));
//
//
//        Object iscorrect;
//        CauTraLoi ctrl1 = new CauTraLoi(1, "Trung Quoc", 1, Dung);
//        CauTraLoi ctrl2 = new CauTraLoi(1, "An Do", 1, Sai);
//        CauTraLoi ctrl3 = new CauTraLoi(1, "Viet Nam", 1, Sai);
//
//
//        ChuDeCauHoi cd1 = new ChuDeCauHoi(1, "Thuc Te");
//        ChuDeCauHoi cd2 = new ChuDeCauHoi(2, "Ly Thuyet");
//        ChuDeCauHoi cd3 = new ChuDeCauHoi(3, "Van Dung");
//
//
//        KieuCauHoi kieu1 = new KieuCauHoi(1, "De");
//        KieuCauHoi kieu2 = new KieuCauHoi(2, "Kho");
//        KieuCauHoi kieu3 = new KieuCauHoi(3, "Trung Binh");
//        KieuCauHoi kieu4 = new KieuCauHoi(4, "Sieu Kho");
//
//        System.out.println("-----------------Thong tin bai kiem tra-----------");
//        System.out.println(ktra1.examID);
//        System.out.println(ktra1.code);
//        System.out.println(ktra1.title);
//        System.out.println(ktra1.categoryID);
//        System.out.println(ktra1.duration);
//        System.out.println(ktra1.creatorID);
//        System.out.println(ktra1.createDate);
//        System.out.println(ktra2.examID);
//        System.out.println(ktra2.code);
//        System.out.println(ktra2.title);
//        System.out.println(ktra2.categoryID);
//        System.out.println(ktra2.duration);
//        System.out.println(ktra2.creatorID);
//        System.out.println(ktra2.createDate);
//        System.out.println(ktra3.examID);
//        System.out.println(ktra3.code);
//        System.out.println(ktra3.title);
//        System.out.println(ktra3.categoryID);
//        System.out.println(ktra3.duration);
//        System.out.println(ktra3.creatorID);
//        System.out.println(ktra3.createDate);
//
//
//        System.out.println("----------------------Thong tin Phong Ban-------------");
//        System.out.println(phongBan1.departmentID);
//        System.out.println(phongBan1.departmentName);
//        System.out.println(phongBan2.departmentID);
//        System.out.println(phongBan2.departmentName);
//        System.out.println(phongBan3.departmentID);
//        System.out.println(phongBan3.departmentName);
//
//
//        System.out.println("-------------------Thong tin Chuc Vu--------");
//        System.out.println(chucVu1.positionId);
//        System.out.println(chucVu1.positionName);
//        System.out.println(chucVu2.positionId);
//        System.out.println(chucVu2.positionName);
//        System.out.println(chucVu3.positionId);
//        System.out.println(chucVu3.positionName);
////Cau1: Kiem tra acc thu 2 neu khong co phong ban thi se in ra nhanviennaychuacophongban
//        if (taiKhoan2 != null && taiKhoan2.departmentID == 0) {
//            System.out.println("nhanviennaychuacophongban");
//        }
//        TaiKhoanNhom tkn1 = new TaiKhoanNhom(1, 2, LocalDate.of(2004, 07, 28));
//        TaiKhoanNhom tkn2 = new TaiKhoanNhom(1, 2, LocalDate.of(2004, 07, 28));
//        //Cau2:
//        if (tkn1.accountID != 2 && tkn2.accountID != 3) {
//            System.out.println("Tai khoan nay khong co trong group");
//        }
//        if (tkn1.accountID == 2 || tkn2.accountID == 2) {
//            System.out.println("Group cua nhan vien 1,2");
//        }
//
//
//        TaiKhoan[] danhsach1 = new TaiKhoan[10];
//        for (int i = 0; i < danhsach1.length; i++) {
//            danhsach1[i] = new TaiKhoan();
//            danhsach1[i].departmentID = i;
//            danhsach1[i].accountID = i;
//            danhsach1[i].userName = "user" + i;
//            danhsach1[i].positionID = i;
//            danhsach1[i].createDate = LocalDate.of(2024, 07, 20);
//        }
//        for (int i = 0; i < danhsach1.length; i++) {
//            System.out.println("thong tin tai khoan so " + i + 1);
//            System.out.println("ID: " + danhsach1[i].accountID);
//            System.out.println("ID phong: " + danhsach1[i].departmentID);
//            System.out.println("Ten tk" + danhsach1[i].userName);
//            System.out.println("Chuc vu" + danhsach1[i].positionID);
//            System.out.println("Ngay: " + danhsach1[i].createDate);
//        }
//        int e=0;
//        while (e < danhsach1.length) {
//            System.out.println("thong tin tai khoan so " + e+ 1);
//            System.out.println("ID: " + danhsach1[e].accountID);
//            System.out.println("ID phong: " + danhsach1[e].departmentID);
//            System.out.println("Ten tk" + danhsach1[e].userName);
//            System.out.println("Chuc vu" + danhsach1[e].positionID);
//            System.out.println("Ngay: " + danhsach1[e].createDate);
//            e++;
//        }
//        int j=0;
//        do {
//            System.out.println("thong tin tai khoan so " + j + 1);
//            System.out.println("ID: " + danhsach1[j].accountID);
//            System.out.println("ID phong: " + danhsach1[j].departmentID);
//            System.out.println("Ten tk" + danhsach1[j].userName);
//            System.out.println("Chuc vu" + danhsach1[j].positionID);
//            System.out.println("Ngay: " + danhsach1[j].createDate);
//            j++;
//        } while (j < danhsach1.length);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so nguyen a: ");
//        int a = sc.nextInt();
//        System.out.println("So nguyen a: " + a);
//        System.out.println("Nhap so nguyen a: ");
//        int b = sc.nextInt();
//        System.out.println("So nguyen b: " + b);
//        System.out.println("Nhap so nguyen a: ");
//        int c = sc.nextInt();
//        System.out.println("So nguyen c: " + c);
//        System.out.println("Nhap so a1: ");
//        float a1 = sc.nextFloat();
//        System.out.println("So a1: " + a1);
//        System.out.println("Nhap so a2: ");
//        float a2 = sc.nextFloat();
//        System.out.println("So a2: " + a2);
//        System.out.println("Nhap so a3: ");
//        float a3 = sc.nextFloat();
//        System.out.println("So a3: " + a3);
//        String hoten = sc.next();
//        System.out.println("Ten toi la" + hoten + ". Toi dang doc than");
//        //cau 15: in ra cac so chan <=20
//        for (int i1 = 0; i1 <= 20; i1++) {
//            if (i1 % 2 == 0) {
//                System.out.println(i1);
//            }
//        }
//        // cau 14:in ra tat ca thong tin account co id<4
//        for (int b1 = 0; b1 < danhsach1.length; b1++) {
//            if (danhsach1[b1].accountID < 4) {
//                System.out.println(danhsach1[b1].accountID);
//                System.out.println(danhsach1[b1].departmentID);
//                System.out.println(danhsach1[b1].userName);
//                System.out.println(danhsach1[b1].positionID);
//            }
//
//        }
//        //Cau 13: in ra tat ca thong tin account ngoai tru account co khac id=2
//        for (int c1 = 0; c1 < danhsach1.length; c1++) {
//            if (danhsach1[c1].accountID != 2) {
//                System.out.println(danhsach1[c1].accountID);
//                System.out.println(danhsach1[c1].departmentID);
//                System.out.println(danhsach1[c1].userName);
//                System.out.println(danhsach1[c1].positionID);
//            }
//        }
//        //cau 12: chi in ra 2 department dau tien
//        PhongBan[] danhsachphongban = new PhongBan[10];
//        for (int d1 = 0; d1 < danhsachphongban.length; d1++) {
//            danhsachphongban[d1].departmentID = d1;
//            danhsachphongban[d1].departmentName = "phong ban " + d1;
//        }
//        for (int d1 = 0; d1 <= 2; d1++) {
//            System.out.println(danhsachphongban[d1].departmentID);
//            System.out.println(danhsachphongban[d1].departmentName);
//        }
//        //cau 11: in ra thong tin cac phong ban
//        for (int d1 = 0; d1 < danhsachphongban.length; d1++) {
//            System.out.println("thong tin phong ban so " + d1 + 1);
//            System.out.println(danhsachphongban[d1].departmentID);
//            System.out.println(danhsachphongban[d1].departmentName);
//        }
//        //Cau 10: in ra thong tin cac acc
//        for (int f1 = 0; f1 < danhsach1.length; f1++) {
//            System.out.println("Thong tin acc thu " + f1 + 1 + "la: ");
//            System.out.println("ten : " + danhsach1[f1].userName);
//            System.out.println("phong ban: " + danhsach1[f1].departmentID);
//            System.out.println(' ');
//        }
//        //cau 9:
//        //cau 8:
//        //cau 7: su dung swich case cho question4
//        //cau 6:
//        //Random
//        //ex2
//        //Cau1:khai bao 1 so nguyen =5 va in ra
//        int s1 = 5;
//        System.out.println("so nguyen: " + s1);
//        //cau2: khai bao int 100000000 va in ra
//        int s2 = 1000000000;
//        System.out.println("so nguyen: " + s2);
//        //cau3: khai bao so thuc
//        float s3 = 5.56789f;
//        System.out.println("so thuc %.4f\n" + s3);
//        //cau 4:
//        String hoten4 = "Trinh Bao Long";
//        System.out.println("Toi la: " + hoten4);
//        //cau5:
//
//        //cau6:
//        System.out.println("So max: " + maxint(1, 2, 3));
//        int[] mang = {1, 2, 3, 4, 5, 6, 8, 7};
////        kiemtra(2);
////        timmax2(mang);
////        kiemtraphantu(mang, 2);
////        tansuat(mang, 2);
//        int[] mang2 = {1, 2, 3, 11,4, 5, 6, 9, 10};
//        int[] mang3 = hopmang(mang, mang2);
//        System.out.println("thong tin mang moi");
//        for (int i = 0; i < mang3.length; i++) {
//            System.out.println(mang3[i]);
//        }
//        int[] arr=sapxepchon(mang);
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Thong tin mang xap xep");
//            System.out.println(arr[i]);
//        }
//        sapxep1(mang2);
//        System.out.println("Thong tin mang");
//        for (int i=0;i<mang2.length;i++){
//            System.out.println(mang2[i]);
//        }

    }

//    //method tim so lon nhat trong 3 so nguyen
//    public static int maxint(int a, int b, int c) {
//        int max = a;
//        if (a > b && a > c) {
//            max = a;
//        } else if (b > a && b > c) {
//            max = b;
//        } else {
//            max = c;
//        }
//        return max;
//    }
//
//    //method kiemtra so chan le
//    public static void kiemtra(int so) {
//        if (so % 2 == 0) {
//            System.out.println("Chan");
//        } else {
//            System.out.println("Le");
//        }
//    }
//
//    //kiemtra phan tu co ton tai trong mang khong
//    public static void kiemtraphantu(int[] mang, int so) {
//        for (int i = 0; i < mang.length; i++) {
//            if (mang[i] == so) {
//                System.out.println("Phan tu co ton tai trong mang");
//                break;
//            }
//        }
//    }
//
//    //dem so lan xuat hien cua phan tu trong mang
//    public static void tansuat(int[] mang, int so) {
//        int dem = 0;
//        for (int i = 0; i < mang.length; i++) {
//            if (mang[i] == so) {
//                dem++;
//            }
//        }
//        System.out.println("Tan xuat cua " + so + " trong mang la: " + dem);
//    }
//
//    //tim phan tu lon thu 2 trong mang
//    public static void timmax2(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    int tg = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tg;
//                }
//            }
//        }
//        System.out.println(arr[1]);
//
//    }
//
//    //hop 2 mang va loai bo phan tu trung nhau
//    public static int[] hopmang(int[] mang1, int[] mang2) {
//        int mang3[] = new int[mang1.length + mang2.length];
//        int dem = 0;
//        for (int i = 0; i < mang1.length; i++) {
//            mang3[dem++] = mang1[i];
//        }
//        for (int i = 0; i < mang2.length; i++) {
//            if (!kiemtrapt(mang3, mang2[i])) {
//                mang3[dem++] = mang2[i];
//            }
//        }
//        int[] ketQua = new int[dem];
//        for (int i = 0; i < dem; i++) {
//            ketQua[i] = mang3[i];
//        }
//
//        return ketQua;
//    }
//
//    public static boolean kiemtrapt(int[] arr, int so) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == so) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    //method in ra cac so chan nguyen duong nho hon 10
//    public static void songuyennhohon10(int gioihan) {
//        System.out.println("Cac so nguyen chan co gioi han");
//        for (int i = 0; i < gioihan; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    //method in ra thong tin account
//    public static void thongtinaccount(TaiKhoan danhsach) {
//        System.out.println("Thong tin account");
//        System.out.println(danhsach.positionID);
//        System.out.println(danhsach.userName);
//        System.out.println(danhsach.accountID);
//        System.out.println(danhsach.departmentID);
//    }
//
//    public static int[] sapxepchon(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            int vtri_min = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[vtri_min]) {
//                    vtri_min = j;
//                }
//            }
//            int tg = arr[vtri_min];
//            arr[vtri_min] = arr[i];
//            arr[i] = tg;
//        }
//        return arr;
//    }
//    public static void sapxeptangdan(int[] arr){
//        for(int i=0;i<arr.length-1;i++){
//            int vtrimin=i;
//            for(int j=i+1; j<arr.length;j++){
//                if(arr[vtrimin]>arr[j]){
//                    vtrimin=j;
//                }
//            }
//            int tg=arr[vtrimin];
//            arr[vtrimin]=arr[i];
//            arr[i]=tg;
//        }
//    }
//    public static void sapxep1(int[] arr){
//        for(int i=0;i<arr.length-1;i++){
//            int vtri=i;
//            for(int j=i+1;j< arr.length;j++){
//                if(arr[j]> arr[vtri]){
//                    vtri=j;
//                }
//            }
//            int tg=arr[vtri];
//            arr[vtri]=arr[i];
//            arr[i]=tg;
//        }
//    }
}
