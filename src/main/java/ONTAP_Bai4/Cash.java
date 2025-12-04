package ONTAP_Bai4;

public class Cash implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan CASH: "+amount);
    }
}
