// File: Annotations/AuthorInfo.java
package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) // This is important for field-level
public @interface FieldInfo {
    String authorName() default "John Doe";
    int experience() default 5; // years of experience
}
