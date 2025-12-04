package ONTAP_Bai4;

public class EWallet implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan EWALLET: "+amount);
    }
}
