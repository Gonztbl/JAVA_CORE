package ONTAP_Bai3;

public class Triangle implements Shape{
    private int canh;

    public Triangle(int canh) {
        this.canh = canh;
    }

    @Override
    public double getArea() {
        return canh*canh;
    }
}
