package ONTAP_Bai3;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle=new Circle(2);
        System.out.println("Thong tin dien tich hinh tron: "+circle.getArea());
        Shape rectangle=new Rectangle(4,3);
        System.out.println("Thong tin dien tich hinh chu nhat: "+rectangle.getArea());
        Shape triangle=new Triangle(4);
        System.out.println("Thong tin dien tich hinh vuong: "+triangle.getArea());
    }

}
