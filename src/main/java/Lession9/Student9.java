package Lession9;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Student9 implements Comparable<Student9>{
    private int id;
    private String name;

    public Student9() {
    }

    public Student9(int id, String name) {
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

    @Override
    public String toString() {
        return "Student9{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student9 o) {
        int giatri=this.name.compareTo(o.name);
        if(giatri<0){
            return -1;
        }
        if(giatri>0){
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student9 student9 = (Student9) o;
        return id == student9.id && Objects.equals(name, student9.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
