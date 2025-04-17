package HashSet_Collection;

import java.util.HashSet;

public class StudentDriver {
	public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        set.add(new Student(1,"Ram"));
        set.add(new Student(2,"Rohan"));
        set.add(new Student(3,"Raj"));
        set.add(new Student(2,"Rohan")); 
        for (Student st : set) {
            System.out.println(st);
        }

	}

}

