package ONTAP_Bai6;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo một ngân hàng
        Bank myBank = new Bank("TINHTECH BANK");

        // 2. Mở các loại tài khoản khác nhau
        BankAccount savingAcc = new SavingAccount("SAV001", 5000000);
        BankAccount checkingAcc = new CheckingAccount("CHK002", 1000000); // Có 1tr, hạn mức thấu chi 2tr

        myBank.addAccount(savingAcc);
        myBank.addAccount(checkingAcc);

        myBank.printAllAccountsInfo();

        // 3. Thực hiện các giao dịch

        System.out.println("--- Giao dich voi tai khoan TIET KIEM (SAV001) ---");
        myBank.executeTransaction("SAV001", "deposit", 1000000); // Nạp 1tr
        myBank.executeTransaction("SAV001", "withdraw", 7000000); // Rút 7tr -> Thất bại
        myBank.executeTransaction("SAV001", "withdraw", 4000000); // Rút 4tr -> Thành công

        System.out.println("\n--- Giao dich voi tai khoan THANH TOAN (CHK002) ---");
        myBank.executeTransaction("CHK002", "withdraw", 2500000); // Rút 2.5tr -> Thành công (thấu chi)
        myBank.executeTransaction("CHK002", "withdraw", 1000000); // Rút 1tr -> Thất bại (vượt hạn mức)
        myBank.executeTransaction("CHK002", "deposit", 2000000); // Nạp 2tr để trả nợ

        // 4. In lại thông tin tất cả tài khoản sau giao dịch
        myBank.printAllAccountsInfo();
    }
}
