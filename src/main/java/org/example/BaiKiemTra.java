package org.example;

import java.time.LocalDate;
import java.util.Date;

public class BaiKiemTra {
    private int examID;
    private int code;
    private String title;
    private int categoryID;
    private int duration;
    private int creatorID;
    private LocalDate createDate;

    public BaiKiemTra(int examID,
                      int code,
                      String title,
                      int categoryID,
                      int duration,
                      int creatorID,
                      LocalDate createDate) {
        this.examID = examID;
        this.code = code;
        this.title = title;
        this.categoryID = categoryID;
        this.duration = duration;
        this.creatorID = creatorID;
        this.createDate = createDate;
    }

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public int getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "BaiKiemTra{" +
                "examID=" + examID +
                ", code=" + code +
                ", title='" + title + '\'' +
                ", categoryID=" + categoryID +
                ", duration=" + duration +
                ", creatorID=" + creatorID +
                ", createDate=" + createDate +
                '}';
    }
}
