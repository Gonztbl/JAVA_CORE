package ONTAP_Bai7;

public class Instructor {
    private int id;
    private String name;
    private String specialty;

    public Instructor(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    private void printInfo() {
        System.out.println("Thong tin nguoi huong dan: " + "ID: " + id + " Name: " + name + " email: " + specialty);
    }
}
