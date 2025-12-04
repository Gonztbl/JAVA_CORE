package ONTAP_Bai3;

public class Rectangle implements Shape{
    private int chieudai;
    private int chieurong;

    public Rectangle(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    @Override
    public double getArea() {
        return chieudai*chieurong;
    }
}
