package Interface;

class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Student ID: " + studentId);
    }
}
