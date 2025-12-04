package ONTAP_Bai4;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan CREDITCARD: "+amount);
    }
}
