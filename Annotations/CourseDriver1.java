// File: Annotations/CourseDriver.java
package Annotations;

import java.lang.reflect.Field;

public class CourseDriver1 {
    public static void main(String[] args) throws Exception {
        Course course = new Course();
        course.display();

        // Reading class-level annotation
        Class<?> cls = course.getClass();
        CourseInfo info = cls.getAnnotation(CourseInfo.class);
        System.out.println("Course Name: " + info.courseName());
        System.out.println("Duration: " + info.duration());

        // Reading field-level annotation
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FieldInfo.class)) {
                field.setAccessible(true);  // <-- Make private field accessible
            	FieldInfo author = field.getAnnotation(FieldInfo.class);
                System.out.println("Instructor Name: " + author.authorName());
                System.out.println("Experience: " + author.experience() + " years");
            }
        }
    }
}
