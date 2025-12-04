package org.example;

import java.util.Objects;

public class PhongBan {
    private int departmentID;
    private String departmentName;

    public PhongBan() {
    }

    public PhongBan(int departmentID) {
        this.departmentID = departmentID = 0;
    }

    public PhongBan(int departmentID, String departmentName) {
        this.departmentID = departmentID = 0;
        this.departmentName = departmentName;

    }

    @Override
    public String toString() {
        return "PhongBan{" +
                "departmentID=" + departmentID +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PhongBan phongBan = (PhongBan) o;
        return Objects.equals(departmentName, phongBan.departmentName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(departmentID, departmentName);
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
