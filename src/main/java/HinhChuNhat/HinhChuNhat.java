package HinhChuNhat;

public class HinhChuNhat {
    private int a;
    private int b;

    public HinhChuNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void chuvi(){
        int chuvi=(this.a+this.b)*2;
        System.out.println("chu vi: "+chuvi);
    }
    public void dientich(){
        int dientich=this.a*this.b;
        System.out.println("dien tich: "+dientich);
    }
}
