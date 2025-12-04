package Lession7;

public class Program4 {
    public static void main(String[] args) {
        int[] array=new int[3];
        try {
            getIndex(10,array);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("cannot find department");
        }
    }
    public static void getIndex(int index, int[] array){
        System.out.println(array[index]);
    }
}
