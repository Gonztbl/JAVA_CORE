package ONTAP_Bai6;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, int balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien rut phai lon hon 0.");
        } else if (amount > balance) {
            System.out.println("Giao dich that bai. Vuot qua han muc thau chi.");
        } else {
            balance -= amount;
            System.out.printf("  - So TK: " + accountNumber + "So du: " + balance + "VND");
            if (balance < 0) {
                System.out.println("CANH BAO: Tai khoan cua ban dang bi am!");
            }
        }
    }

    @Override
    public void printAccountInfo() {
        super.printAccountInfo();
    }
}
