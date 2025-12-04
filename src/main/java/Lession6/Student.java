package Lession6;

class Student implements IStudent {
    private int ID;
    private String name;
    private int group;

    public Student() {
    }

    public Student(int ID, String name, int group) {
        this.ID = ID;
        this.name = name;
        this.group = group;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public void diemdanh() {
        System.out.println(name + "diem danh");
    }

    @Override
    public void hocbai() {
        System.out.println(name + "hoc bai");
    }

    @Override
    public void didonvesinh() {
        System.out.println(name + "don ve sinh");
    }
}
