package HashSet_Collection;

import java.util.Objects;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        /*if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && Objects.equals(name, student.name);*/
        
        
        Student s=(Student) obj;
        return this.id==s.id && (this.name.equals(s.name));
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student id: " + id + ", Name: " + name;
    }
}
