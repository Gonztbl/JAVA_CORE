package ONTAP_Bai6;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<BankAccount> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.printf("Da mo tai khoan moi %s tai ngan hang %s.\n", account.getAccountNumber(), this.bankName);
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null; // Không tìm thấy
    }

    public void executeTransaction(String accountNumber, String transactionType, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Loi: Khong tim thay tai khoan " + accountNumber);
            return;
        }

        if ("deposit".equalsIgnoreCase(transactionType)) {
            account.deposit(amount);
        } else if ("withdraw".equalsIgnoreCase(transactionType)) {
            // Đây là tính đa hình: JVM sẽ tự động gọi đúng phương thức withdraw()
            // của SavingAccount hoặc CheckingAccount tùy vào loại đối tượng thực tế.
            account.withdraw(amount);
        } else {
            System.out.println("Loai giao dich khong hop le.");
        }
    }

    public void printAllAccountsInfo() {
        System.out.println("\n--- THONG TIN TAT CA TAI KHOAN TAI NGAN HANG " + bankName + " ---");
        if (accounts.isEmpty()) {
            System.out.println("Ngan hang chua co tai khoan nao.");
        } else {
            for (BankAccount account : accounts) {
                account.printAccountInfo();
            }
        }
        System.out.println("------------------------------------------------------\n");
    }
}
