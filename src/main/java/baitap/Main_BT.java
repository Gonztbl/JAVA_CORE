package baitap;

public class Main_BT {
    public static void main(String[] args) {
        CanBo congNhan = new CongNhan(Gioitinh.nam, "Long", 21, "Thanh_Hoa");
        System.out.println(congNhan);
        KySu kySu = new KySu(Gioitinh.nam, "Long",21,"ThanhHoa", "CNTT");
        System.out.println(kySu);
        NhanVien nhanVien=new NhanVien(Gioitinh.nam,"Long",21,"ThanhHoa","SinhVien");
        System.out.println(nhanVien);
    }
}
