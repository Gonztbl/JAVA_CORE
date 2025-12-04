package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class TaiKhoan {
    private int accountID;
    private String email;
    private String firstName;
    private String lastName;
    private String userName;
    private String fullName;
    private int departmentID;
    private int positionID;
    private LocalDateTime createDate;

    public TaiKhoan() {
    }

    public TaiKhoan(int accountID, String email, String firstName, String lastName, String userName) {
        this.accountID = accountID;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.fullName = firstName + lastName;
    }

    public TaiKhoan(int accountID, String email, String lastName, String firstName, String userName, int positionID, LocalDateTime createDate) {
        this.accountID = accountID;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.userName = userName;
        this.fullName = firstName + lastName;
        this.positionID = positionID;
        this.createDate = createDate;
    }

    public TaiKhoan(int accountID, int positionID, String userName, String lastName, String email, String firstName) {
        this.accountID = accountID;
        this.createDate = LocalDateTime.now();
        this.positionID = positionID;
        this.fullName = fullName;
        this.userName = userName;
        this.lastName = lastName;
        this.email = email;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "accountID=" + accountID +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", departmentID=" + departmentID +
                ", positionID=" + positionID +
                ", createDate=" + createDate +
                '}';
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getPositionID() {
        return positionID;
    }

    public void setPositionID(int positionID) {
        this.positionID = positionID;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}
