package baitap;

public class CanBo {
    private Gioitinh gioiTinh;
    private String hoTen;
    private int tuoi;
    private String diaChi;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Gioitinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Gioitinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public CanBo(Gioitinh gioiTinh, String hoTen, int tuoi, String diaChi) {
        this.gioiTinh = gioiTinh;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "gioiTinh=" + gioiTinh +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
