package OnTAPCOLLECTION;

import org.jetbrains.annotations.NotNull;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Oder implements Comparable<Oder> {
    private static final AtomicInteger autoID = new AtomicInteger(0);
    private int oderId;
    private String customerName;
    private int totalAmount;
    private LocalDate date;

    public Oder() {

    }

    public Oder(String customerName, int totalAmount) {
        this.oderId = autoID.getAndIncrement();
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.date = LocalDate.now();

    }

    public int getOderId() {
        return oderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Oder{" +
                "oderId=" + oderId +
                ", customerName='" + customerName + '\'' +
                ", totalAmount=" + totalAmount +
                ", date=" + date +
                '}';
    }

    @Override
    public int compareTo(@NotNull Oder o) {
        if (this.totalAmount < o.totalAmount) {
            return -1;
        }
        if (this.totalAmount > o.totalAmount) {
            return 1;
        }
        return 0;
    }


}
