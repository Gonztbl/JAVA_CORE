package org.example;

import java.time.LocalDate;
import java.util.Date;

public class TaiKhoanNhom {
    private int groupID;
    private int accountID;
    private LocalDate joinDate;

    public TaiKhoanNhom(int groupID, int accountID, LocalDate joinDate) {
        this.groupID = groupID;
        this.accountID = accountID;
        this.joinDate = joinDate;

    }

    @Override
    public String toString() {
        String result = "";
        result += "Group account: " + groupID + "Account ID: " + accountID + " Join Date: " + joinDate;
        return result;
    }

    public int getGroupID() {
        return groupID;
    }

    public int getAccountID() {
        return accountID;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
}
