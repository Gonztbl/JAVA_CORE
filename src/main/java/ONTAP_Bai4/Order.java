package ONTAP_Bai4;

public class Order {
    private Product[] products;
    private PaymentMethod paymentMethod;
    private int count;

    public Order(int capacity, PaymentMethod paymentMethod) {

        this.products = new Product[capacity];
        this.paymentMethod = paymentMethod;
        this.count = 0;
    }
    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Gio hang da day, khong the them san pham!");
        }
    }

    public void checkout() {
        double totalPrice = 0;
        System.out.println("--- Chi tiet don hang ---");
        for (int i = 0; i < count; i++) {
            totalPrice += products[i].getPice();
            System.out.printf("- San pham: %s, Gia: %d\n", products[i].getName(), products[i].getPice());
        }
        System.out.println("-------------------------");
        System.out.println("Tong tien: " + totalPrice);

        // Gọi thanh toán
        paymentMethod.pay(totalPrice);
    }
}