package ObjectClass;

public class Driver1 {
    public static void main(String[] args) {
        Student student1 = new Student("Sneha", 1, "Female", 88.5);
        Student student2 = new Student("Ram", 2, "Male", 75.2);
        Student student3 = new Student("Rashi", 1, "Female", 88.5);

        System.out.println(student1);
        System.out.println(student2);
        
        System.out.println("Are student1 and student2 equal? " + student1.equals(student2));
        System.out.println("Are student1 and student3 equal? " + student1.equals(student3));

        System.out.println("Hash code of student1: " + student1.hashCode());
        System.out.println("Hash code of student2: " + student2.hashCode());
        System.out.println("Hash code of student3: " + student3.hashCode());
    }
}

