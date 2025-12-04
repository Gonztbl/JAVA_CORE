package baitap;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(Gioitinh gioiTinh, String hoTen, int tuoi, String diaChi) {
        super(gioiTinh, hoTen, tuoi, diaChi);
    }

    public NhanVien(Gioitinh gioiTinh, String hoTen, int tuoi, String diaChi, String congViec) {
        super(gioiTinh, hoTen, tuoi, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                '}';
    }
}
