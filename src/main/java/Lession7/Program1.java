package Lession7;

public class Program1 {
    public static void main(String[] args) {
        try {
            float result= divide(7,0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("cannot devide=0");
        }
        finally {
            System.out.println("devide thanh cong roi ne");
        }


    }
    public static float divide(int a,int b){
        return a/b;
    }
}
