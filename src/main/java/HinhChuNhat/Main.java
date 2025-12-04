package HinhChuNhat;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn=new HinhChuNhat(3,4);
        System.out.println("HCN");
        hcn.chuvi();
        hcn.dientich();
        HinhVuong hv=new HinhVuong(3);
        System.out.println("HV");
        hv.chuvi();
        hv.dientich();
    }
}
