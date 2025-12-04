package ONTAP_Bai4;

public class Product {
    private String name;
    private int pice;

    public Product(String name, int pice) {
        this.name = name;
        this.pice = pice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPice() {
        return pice;
    }

    public void setPice(int pice) {
        this.pice = pice;
    }
}
