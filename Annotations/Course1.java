// File: Annotations/Course.java
package Annotations;

public class Course1 {

    @FieldInfo(authorName = "Ram", experience = 7)
    private String instructor;

    public void display() {
        System.out.println("Welcome to course");
    }
}
