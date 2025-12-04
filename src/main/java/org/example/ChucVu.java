package org.example;

public class ChucVu {
    private int positionId;
    private String positionName;

    public ChucVu(int positionId, String positionName) {
        this.positionName = positionName;
        this.positionId = positionId;

    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "ChucVu{" +
                "positionId=" + positionId +
                ", positionName='" + positionName + '\'' +
                '}';
    }
}
