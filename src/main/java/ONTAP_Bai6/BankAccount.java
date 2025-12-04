package ONTAP_Bai6;

public abstract class BankAccount {
    protected String accountNumber;
    protected int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("  -Thanh cong So TK: " + accountNumber + "So du: " + balance + "VND");
        } else {
            System.out.println("So tien nap phai lon hon 0.");
        }
    }

    public abstract void withdraw(double amount);

    /**
     * In thông tin chi tiết của tài khoản.
     */
    public void printAccountInfo() {
        System.out.printf("  - So TK: " + accountNumber + "So du: " + balance + "VND");
    }
}


