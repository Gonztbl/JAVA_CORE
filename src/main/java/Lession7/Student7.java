package Lession7;

public class Student7 {
    private int id;
    private String name;
    static String collecge;
    static int moneyGroup;

    public Student7(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollecge() {
        return collecge;
    }

    public static void setCollecge(String collecge) {
        Student7.collecge = collecge;
    }

    public static int getMoneyGroup() {
        return moneyGroup;
    }

    public static void setMoneyGroup(int moneyGroup) {
        Student7.moneyGroup = moneyGroup;
    }

    @Override
    public String toString() {
        return "Student7{" +
                "id=" + id +
                ", name='" + name + '\'' + "Truong: " + Student7.collecge +
                '}';
    }
    public static void thaycollege(String gtri){
        collecge=gtri;
    }
}
