package PolymophismTask;

public class Professor extends Person {
    private String specialization;

    public Professor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Professor - Name: " + getName() + ", Age: " + getAge() + ", Specialization: " + specialization);
    }
}