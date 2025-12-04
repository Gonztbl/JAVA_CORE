package ONTAP_Bai6;

public class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, int balance) {
        super(accountNumber, balance);

    }

    @Override
    public void withdraw(double amount) {
        System.out.printf("Yeu cau rut %.2f VND tu TK TIET KIEM %s...\n", amount, accountNumber);
        if (amount <= 0) {
            System.out.println("So tien rut phai lon hon 0.");
        } else if (amount > balance) {
            System.out.println("Giao dich that bai. So du khong du.");
        } else {
            balance -= amount;
            System.out.printf("  - So TK: " + accountNumber + "So du: " + balance + "VND");
        }


    }
}
