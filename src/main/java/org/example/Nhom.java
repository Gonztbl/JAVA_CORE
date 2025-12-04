package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Nhom {
    //thuoc tinh
    private int groupID;
    private String groupName;
    private int creatorID;
    private LocalDate createDate;

    public Nhom(int groupID, String groupName, int creatorID, LocalDate createDate) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.creatorID = creatorID;
        this.createDate = createDate;
        //hanh dong void hanhdong(inut bien){hanh dong+output}


    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    @Override
    public String toString() {
        return "Nhom{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", creatorID=" + creatorID +
                ", createDate=" + createDate +
                '}';
    }
}
