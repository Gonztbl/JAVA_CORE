package ONTAP_Bai4;

public class Main {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        Product laptop = new Product("Laptop Dell", 20000);
        Product mouse = new Product("Chuot Logitech", 500);
        // Kịch bản 1: Thanh toán bằng tiền mặt
        System.out.println("--- DON HANG 1 ---");
        Order order1 = new Order(5, new Cash());
        order1.addProduct(laptop); // Thêm sản phẩm vào giỏ
        order1.addProduct(mouse);
        order1.checkout(); // Tiến hành thanh toán
        System.out.println("\n--- DON HANG 2 ---");
        Order order2 = new Order(5, new CreditCard());
        order2.addProduct(laptop);
        order2.checkout();
    }
}
