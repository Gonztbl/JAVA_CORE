package Lession8;

import java.util.Objects;

public class Student8 {
    private int id;
    private String name;
    private static int soluong = 0;

    public Student8(String name) {
        this.id = soluong;
        soluong++;
        this.name = name;

    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student8{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student8 student8 = (Student8) o;
        return Objects.equals(name, student8.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
