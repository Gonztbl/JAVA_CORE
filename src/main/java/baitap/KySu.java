package baitap;

public class KySu extends CanBo{
    private String nganhdaoTao;

    public KySu(Gioitinh gioiTinh, String hoTen, int tuoi, String diaChi, String nganhdaoTao) {
        super(gioiTinh, hoTen, tuoi, diaChi);
        this.nganhdaoTao = nganhdaoTao;
    }

    public KySu(Gioitinh gioiTinh, String hoTen, int tuoi, String diaChi) {
        super(gioiTinh, hoTen, tuoi, diaChi);
    }

    public String getNganhdaoTao() {
        return nganhdaoTao;
    }

    public void setNganhdaoTao(String nganhdaoTao) {
        this.nganhdaoTao = nganhdaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhdaoTao='" + nganhdaoTao + '\'' +
                '}';
    }
}
