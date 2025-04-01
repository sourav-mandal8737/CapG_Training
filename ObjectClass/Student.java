package ObjectClass;

import java.util.Objects;

public class Student {
    private String name;
    private int id;
    private String gender;
    private double marks;

    public Student(String name, int id, String gender, double marks) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                ", marks=" + marks +
                '}';
    }
}
