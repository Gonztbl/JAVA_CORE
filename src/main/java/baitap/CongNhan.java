package baitap;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(Gioitinh gioiTinh, String hoTen, int tuoi, String diaChi) {
        super(gioiTinh,hoTen,tuoi,diaChi);
    }

    public CongNhan(Gioitinh gioiTinh, String hoTen, int tuoi, String diaChi,int bac) {
        super(gioiTinh,hoTen,tuoi,diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                '}';
    }
}
